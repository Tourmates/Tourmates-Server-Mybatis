package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;
import com.ssafy.tourmates.article.service.ArticleService;
import com.ssafy.tourmates.article.service.dto.AddArticleDto;
import com.ssafy.tourmates.article.service.dto.EditArticleDto;
import com.ssafy.tourmates.common.Page;
import com.ssafy.tourmates.controller.dto.request.AddArticleRequest;
import com.ssafy.tourmates.controller.dto.request.EditArticleRequest;
import com.ssafy.tourmates.controller.dto.response.ArticleResponse;
import com.ssafy.tourmates.controller.dto.response.DetailArticleResponse;
import com.ssafy.tourmates.member.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public String articles(
            @RequestParam(required = false) String keyword,
            @RequestParam(defaultValue = "1") Integer sorted,
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "10") Integer amount,
            Model model) {

        SearchArticleCondition condition = SearchArticleCondition.builder()
                .keyword(keyword)
                .sorted(sorted)
                .build();

        List<ArticleResponse> articles = articleService.searchArticle(condition, pageNum, amount);
        int totalCount = articleService.totalCount();
        Page page = new Page(pageNum, amount, totalCount);

        model.addAttribute("page", page);
        model.addAttribute("articles", articles);
        return "article/articleList";
    }

    @GetMapping("/register")
    public String registerArticle() {
        return "article/registerArticle";
    }

    @PostMapping("/register")
    public String registerArticle(AddArticleRequest request, @SessionAttribute("loginMember") Member member) {
        AddArticleDto dto = AddArticleDto.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .tag(request.getTag())
                .build();
        Long savedArticleId = articleService.addArticle(member.getLoginId(), dto);
        return "redirect:/articles";
    }

    @GetMapping("/{articleId}")
    public String detailArticle(@PathVariable Long articleId, Model model) {
        DetailArticleResponse article = articleService.detailArticle(articleId);
        articleService.increaseHit(articleId);
        model.addAttribute("article", article);
        return "article/detailArticle";
    }

    @GetMapping("/{articleId}/edit")
    public String editArticle(@PathVariable Long articleId, Model model) {
        DetailArticleResponse article = articleService.detailArticle(articleId);
        model.addAttribute("article", article);
        return "article/editArticle";
    }

    @PostMapping("/{articleId}/edit")
    public String editArticle(@PathVariable Long articleId, @SessionAttribute("loginMember") Member member, EditArticleRequest request) {
        EditArticleDto dto = EditArticleDto.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();
        Long editArticleId = articleService.editArticle(articleId, member.getLoginId(), dto);
        return "redirect:/articles";
    }

    @GetMapping("/{articleId}/remove")
    public String removeArticle(@PathVariable Long articleId, @SessionAttribute("loginMember") Member member) {
        Long removeArticleId = articleService.removeArticle(articleId, member.getLoginId());
        return "redirect:/articles";
    }
}
