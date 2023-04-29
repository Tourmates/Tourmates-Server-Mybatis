package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.controller.dto.AddMemberRequest;
import com.ssafy.tourmates.controller.dto.modify.ModifyNoticeRequest;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.notice.service.NoticeService;
import com.ssafy.tourmates.notice.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.service.dto.ModifyNoticeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {


  private NoticeService noticeService;

  public NoticeController(NoticeService noticeService) {
    this.noticeService = noticeService;
  }

  @GetMapping("/add")
  public String addNotice(@SessionAttribute("loginMember") Member loginMember) {
    if (loginMember == null) {
      return "loginForm"; //TODO: 나중에 바꾸기
    }
    return "/notice/noticeRegisterForm";
  }

  @GetMapping("/modify/{noticeId}")
  public String modifyNotice(@PathVariable("noticeId") Long noticeId,
      @SessionAttribute(value = "loginMember", required = false) Member loginMember,
      Model model) {

    noticeService.checkAuthority(loginMember);
    ModifyNoticeDto modifyNoticeDto = noticeService.getNotice(noticeId);
    model.addAttribute("modifyNoticeDto", modifyNoticeDto);

    return "modifyForm"; //TODO: 나중에 바꾸기

  }

  @GetMapping("/delete/{noticeId}")
  public String delteNotice(@PathVariable("noticeId") Long noticeId,
      @SessionAttribute("loginMember") Member loginMember) {

    if (loginMember == null) {
      return "loginForm";
    }

    noticeService.checkAuthority(loginMember);

    noticeService.delete(noticeId);

    return "redirect:/notice/list"; //TODO : list 메소드 만들기
  }

  @GetMapping("/list")
  public String noticeList() {
    return null;
  }


  @PostMapping("/add")
  public String addNotice(@RequestBody AddMemberRequest.AddNoticeRequest addNoticeRequest,
      @SessionAttribute(value = "loginMember", required = false) Member loginMember,
      Model model) {

    if (loginMember == null) {
      return "loginForm"; //TODO: 나중에 바꾸기
    }

    noticeService.checkAuthority(loginMember);

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


  @PostMapping("/modify/{noticeId}")
  public String modifyNotice(@PathVariable("noticeId") Long noticeId,
      @RequestBody ModifyNoticeRequest modifyNoticeRequest,
      @SessionAttribute("loginMember") Member loginMember) {

    if (loginMember == null) {
      return "loginForm"; //TODO: 나중에 바꾸기
    }

    noticeService.checkAuthority(loginMember);

    ModifyNoticeDto modifyNoticeDto = ModifyNoticeDto.builder()
        .title(modifyNoticeRequest.getTitle())
        .content(modifyNoticeRequest.getContent())
        .top(modifyNoticeRequest.isTop())
        .build();

    noticeService.edit(noticeId, modifyNoticeDto);

    return null;
  }
}
