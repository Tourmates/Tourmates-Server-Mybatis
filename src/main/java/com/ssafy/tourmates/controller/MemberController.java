package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.authoriry.Login;
import com.ssafy.tourmates.controller.dto.request.EditLoginPwRequest;
import com.ssafy.tourmates.controller.dto.request.EditPersonalInfoRequest;
import com.ssafy.tourmates.controller.dto.response.PersonalInfoResponse;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.service.MemberService;
import com.ssafy.tourmates.member.service.dto.EditLoginPwDto;
import com.ssafy.tourmates.member.service.dto.EditPersonalInfoDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/mypage")
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public String mypage(@Login Member member) {
        return "member/mypage";
    }

    @GetMapping("/personal")
    public String personalInfo(@Login Member member, Model model) {
        PersonalInfoResponse response = memberService.searchPersonalInfo(member.getLoginId());
        model.addAttribute("personalInfo", response);
        return "member/personalInfo";
    }

    @PostMapping("/personal")
    public String personalInfo(EditPersonalInfoRequest request, @Login Member member) {
        EditPersonalInfoDto dto = EditPersonalInfoDto.builder()
                .nickname(request.getNickname())
                .email(request.getEmailId() + "@" + request.getEmailDomain())
                .phone(request.getStartPhoneNumber() + "-" + request.getMiddlePhoneNumber() + "-" + request.getEndPhoneNumber())
                .build();

        Long memberId = memberService.editPersonalInfo(member.getLoginId(), dto);
        return "redirect:/mypage/personal";
    }

    @GetMapping("/account")
    public String account(@Login Member member, Model model) {
        return "member/account";
    }

    @PostMapping("/account")
    public String account(EditLoginPwRequest request, @Login Member member) {
        EditLoginPwDto dto = EditLoginPwDto.builder()
                .oldLoginPw(request.getOldLoginPw())
                .newLoginPw(request.getNewLoginPw())
                .build();

        Long memberId = memberService.editLoginPw(member.getLoginId(), dto);
        return "redirect:/mypage/account";
    }
}
