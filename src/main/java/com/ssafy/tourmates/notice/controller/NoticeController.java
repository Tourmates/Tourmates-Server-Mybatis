package com.ssafy.tourmates.notice.controller;

import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.notice.controller.dto.AddNoticeRequest;
import com.ssafy.tourmates.notice.model.Notice;
import com.ssafy.tourmates.notice.model.service.NoticeService;
import com.ssafy.tourmates.notice.model.service.dto.AddNoticeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private NoticeService noticeService;

    public NoticeController(NoticeService noticeService){
        this.noticeService = noticeService;
    }

    @GetMapping("/add")
    public String addNotice(@SessionAttribute("loginMember") Member loginMember){
        if(loginMember == null){
            return "loginForm"; //TODO: 나중에 바꾸기
        }
        return "noticeForm";
    }

    @PostMapping("/add")
    public String addNotice(@RequestBody AddNoticeRequest addNoticeRequest, @SessionAttribute("loginMember") Member loginMember, Model model){

        if(loginMember == null){
            return "loginForm"; //TODO: 나중에 바꾸기
        }
        AddNoticeDto dto = AddNoticeDto.builder()
                .title(addNoticeRequest.getTitle())
                .content(addNoticeRequest.getContent())
                .top(addNoticeRequest.isTop())
                .createdBy(loginMember)
                .lastModifiedBy(loginMember)
                .build();

        Long noticeId = noticeService.add(dto, loginMember);
        model.addAttribute("dto", dto);

        return "redirect:/notice/" + noticeId + "/detail";
    }
}
