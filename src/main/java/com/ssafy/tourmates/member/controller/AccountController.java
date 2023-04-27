package com.ssafy.tourmates.member.controller;

import com.ssafy.tourmates.member.model.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
@Slf4j
public class AccountController {

    private final MemberService memberService;
}
