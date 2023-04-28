package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.controller.dto.AddMemberRequest;
import com.ssafy.tourmates.member.service.MemberService;
import com.ssafy.tourmates.member.service.dto.AddMemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final MemberService memberService;

    @PostMapping("/join")
    public String joinMember(@Valid AddMemberRequest request) {
        log.debug("AccountController#joinMember");

        AddMemberDto dto = AddMemberDto.builder()
                .loginId(request.getLoginId())
                .loginPw(request.getLoginPw())
                .username(request.getUsername())
                .email(request.getEmail())
                .phone(request.getPhone())
                .birth(request.getBirth())
                .gender(request.getGender())
                .nickname(request.getNickname())
                .authority(request.getAuthority())
                .build();
        Long memberId = memberService.joinMember(dto);
        log.debug("join memberId = {}", memberId);
        log.info("join new member");
        return "redirect:/";
    }
}
