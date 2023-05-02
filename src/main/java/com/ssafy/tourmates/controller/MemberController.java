package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.article.service.ArticleService;
import com.ssafy.tourmates.authoriry.Login;
import com.ssafy.tourmates.controller.dto.request.EditLoginPwRequest;
import com.ssafy.tourmates.controller.dto.request.EditPersonalInfoRequest;
import com.ssafy.tourmates.controller.dto.response.ArticleResponse;
import com.ssafy.tourmates.controller.dto.response.HotplaceResponse;
import com.ssafy.tourmates.controller.dto.response.PersonalInfoResponse;
import com.ssafy.tourmates.hotplace.service.HotplaceService;
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

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/my")
public class MemberController {

    private final MemberService memberService;
    private final ArticleService articleService;
    private final HotplaceService hotplaceService;

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
        return "redirect:/my/personal";
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
        return "redirect:/my/account";
    }

    @GetMapping("/articles")
    public String myArticles(@Login Member member, Model model) {
        List<ArticleResponse> articles = articleService.searchMyArticle(member.getId(), 1, 10);
        model.addAttribute("articles", articles);
        return "member/myArticleList";
    }

    @GetMapping("/hotplaces")
    public String myHotplaces(@Login Member member, Model model) {
        List<HotplaceResponse> hotplaces = hotplaceService.searchMyHotplaces(member.getId(), 1, 9);
        model.addAttribute("hotplaces", hotplaces);
        return "member/myHotplaceList";
    }

    @GetMapping("/tripplans")
    public String myTripPlan(@Login Member member, Model model) {
        return null;
    }

    @GetMapping("/withdrawal")
    public String withdrawal(@Login Member member) {
        return "member/withdrawal";
    }

    @PostMapping("/withdrawal")
    public String withdrawal(@Login Member member, String loginPw) {
        log.debug("회원탈퇴");
        return "member/withdrawal";
    }
}
