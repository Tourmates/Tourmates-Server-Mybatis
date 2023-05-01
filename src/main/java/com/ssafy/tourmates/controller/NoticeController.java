package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.controller.dto.modify.EditNoticeRequest;
import com.ssafy.tourmates.controller.dto.request.AddNoticeRequest;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.notice.service.NoticeService;
import com.ssafy.tourmates.notice.service.dto.AddNoticeDto;
import com.ssafy.tourmates.notice.service.dto.DetailNoticeDto;
import com.ssafy.tourmates.notice.service.dto.ModifyNoticeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

  private final NoticeService noticeService;

  @GetMapping("/add")
  public String addNotice(@SessionAttribute("loginMember") Member loginMember) {
    if (loginMember == null) {
      return "loginForm"; //TODO: 나중에 바꾸기
    }

    return "/notice/noticeRegisterForm";
  }

  @GetMapping("/{noticeId}/detail")
  public String detailNotice(@PathVariable("noticeId") Long noticeId,
                             @SessionAttribute(value = "loginMember", required = false) Member loginMember,
                             Model model) {

    noticeService.checkAuthority(loginMember);
    DetailNoticeDto detailNoticeDto = noticeService.getDetailNotice(noticeId);
    model.addAttribute("detailNoticeDto", detailNoticeDto);

    return "/notice/noticeDetailForm";

  }

  @GetMapping("/{noticeId}/modify")
  public String modifyNotice(@PathVariable("noticeId") Long noticeId,
      @SessionAttribute(value = "loginMember", required = false) Member loginMember,
      Model model) {

    noticeService.checkAuthority(loginMember);
    ModifyNoticeDto modifyNoticeDto = noticeService.getModifyNotice(noticeId);
    model.addAttribute("modifyNoticeDto", modifyNoticeDto);

    return "/notice/noticeModifyForm";

  }

  @GetMapping("/{noticeId}/delete")
  public String deleteNotice(@PathVariable("noticeId") Long noticeId,
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


  @PostMapping("/register")
  public String addNotice(@ModelAttribute AddNoticeRequest addNoticeRequest,
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


  @PostMapping("/{noticeId}/modify")
  public String modifyNotice(@PathVariable("noticeId") Long noticeId,
      @ModelAttribute EditNoticeRequest editNoticeRequest,
      @SessionAttribute("loginMember") Member loginMember) {

    if (loginMember == null) {
      return "loginForm"; //TODO: 나중에 바꾸기
    }

    noticeService.checkAuthority(loginMember);

    ModifyNoticeDto modifyNoticeDto = ModifyNoticeDto.builder()
        .id(noticeId)
        .title(editNoticeRequest.getTitle())
        .content(editNoticeRequest.getContent())
        .top(editNoticeRequest.isTop())
        .build();

    noticeService.edit(noticeId, modifyNoticeDto);

    return null;
  }
}
