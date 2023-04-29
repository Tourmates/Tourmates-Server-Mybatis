package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.controller.dto.request.EditPersonalInfoRequest;
import com.ssafy.tourmates.controller.dto.response.PersonalInfoResponse;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.service.MemberService;
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
    public String mypage() {
        return "member/mypage";
    }

    @GetMapping("/personal")
    public String personalInfo(@SessionAttribute(name = "loginMember") Member member, Model model) {
        PersonalInfoResponse response = memberService.searchPersonalInfo(member.getLoginId());
        model.addAttribute("personalInfo", response);
        return "member/personalInfo";
    }

    @PostMapping("/personal")
    public String personalInfo(EditPersonalInfoRequest request, @SessionAttribute(name = "loginMember") Member member) {
        EditPersonalInfoDto dto = EditPersonalInfoDto.builder()
                .nickname(request.getNickname())
                .email(request.getEmailId() + "@" + request.getEmailDomain())
                .phone(request.getStartPhoneNumber() + "-" + request.getMiddlePhoneNumber() + "-" + request.getEndPhoneNumber())
                .build();

        Long memberId = memberService.editPersonalInfo(member.getLoginId(), dto);
        return "redirect:/mypage/personal";
    }
}
