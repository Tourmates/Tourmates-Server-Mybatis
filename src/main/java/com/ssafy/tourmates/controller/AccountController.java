package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.controller.dto.AddMemberRequest;
import com.ssafy.tourmates.controller.dto.request.ForgotLoginIdRequest;
import com.ssafy.tourmates.controller.dto.request.ForgotLoginPwRequest;
import com.ssafy.tourmates.controller.dto.request.LoginRequest;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.service.AccountService;
import com.ssafy.tourmates.member.service.MemberService;
import com.ssafy.tourmates.member.service.dto.AddMemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import static com.ssafy.tourmates.member.Authority.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final MemberService memberService;
    private final AccountService accountService;

    @PostMapping("/join")
    public String joinMember(@Valid AddMemberRequest request) {
        log.debug("AccountController#joinMember");

        AddMemberDto dto = AddMemberDto.builder()
                .loginId(request.getLoginId())
                .loginPw(request.getLoginPw())
                .username(request.getUsername())
                .email(request.getEmailId() + "@" + request.getEmailDomain())
                .phone(request.getStartPhoneNumber() + "-" + request.getMiddlePhoneNumber() + "-" + request.getEndPhoneNumber())
                .birth(request.getBirth())
                .gender(request.getGender().substring(0, 1))
                .nickname(request.getNickname())
                .authority(CLIENT)
                .build();

        Long memberId = memberService.joinMember(dto);
        log.debug("memberId={}", memberId);
        log.info("join new member");
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "index";
    }

    @PostMapping("/login")
    public String login(
            @Valid LoginRequest request,
            @RequestParam(defaultValue = "/") String redirectURL,
            HttpSession session,
            HttpServletResponse response) {
        log.debug("AccountController#login");

        Member loginMember = accountService.login(request.getLoginId(), request.getLoginPw());
        if (loginMember == null) {
            return null;
        }
        if (request.getSaveLoginId() == null) {
            Cookie cookie = new Cookie("savedLoginId", loginMember.getLoginId());
            cookie.setMaxAge(60 * 60 * 24 * 365 * 40); //유효기간 40년
            response.addCookie(cookie);
        }
        session.setAttribute("loginMember", loginMember);
        log.info("회원 로그인={}", loginMember.getLoginId());
        log.info("redirectURL={}", redirectURL);
        return "redirect:" + redirectURL;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        log.debug("회원 로그아웃");
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/forgot/loginId")
    public String forgotLoginId(@Valid ForgotLoginIdRequest request) {
        log.debug("AccountController#forgotLoginId");
        String phone = request.getStartPhoneNumber() + "-" + request.getMiddlePhoneNumber() + "-" + request.getEndPhoneNumber();
        String email = request.getEmailId() + "@" + request.getEmailDomain();
        String loginId = accountService.findLoginId(phone, email);
        return "redirect:/";
    }

    @PostMapping("/forgot/loginPw")
    public String forgotLoginPw(@Valid ForgotLoginPwRequest request) {
        log.debug("AccountController#forgotLoginPW");
        String loginId = request.getLoginId();
        String phone = request.getStartPhoneNumber() + "-" + request.getMiddlePhoneNumber() + "-" + request.getEndPhoneNumber();
        String email = request.getEmailId() + "@" + request.getEmailDomain();
        String loginPw = accountService.findLoginPw(loginId, phone, email);
        return "redirect:/";
    }
}
