package com.ssafy.tourmates.article.service;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.ArticleRepository;
import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;
import com.ssafy.tourmates.article.service.dto.AddArticleDto;
import com.ssafy.tourmates.article.service.dto.EditArticleDto;
import com.ssafy.tourmates.controller.dto.response.ArticleResponse;
import com.ssafy.tourmates.controller.dto.response.DetailArticleResponse;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final MemberRepository memberRepository;

    @Override
    public Long addArticle(String loginId, AddArticleDto dto) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }

        Member member = findMember.get();
        Article article = Article.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .tag(dto.getTag())
                .member(member)
                .build();

        Article savedArticle = articleRepository.save(article);
        return savedArticle.getId();
    }

    @Override
    public List<ArticleResponse> searchArticle(SearchArticleCondition condition, int pageNum, int amount) {
        List<Article> articles = articleRepository.findByCondition(condition, pageNum, amount);
        return articles.stream()
                .map(article -> ArticleResponse.builder()
                        .articleId(article.getId())
                        .title(article.getTitle())
                        .hit(article.getHit())
                        .tag(article.getTag())
                        .nickname(article.getMember().getNickname())
                        .createdDate(article.getCreatedDate())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public List<ArticleResponse> searchMyArticle(Long memberId, int pageNum, int amount) {
        List<Article> articles = articleRepository.findByConditionAndMemberId(memberId, pageNum, amount);
        return articles.stream()
                .map(article -> ArticleResponse.builder()
                        .articleId(article.getId())
                        .title(article.getTitle())
                        .hit(article.getHit())
                        .tag(article.getTag())
                        .nickname(article.getMember().getNickname())
                        .createdDate(article.getCreatedDate())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public DetailArticleResponse detailArticle(Long articleId) {
        Optional<Article> findArticle = articleRepository.findDetailById(articleId);
        if (!findArticle.isPresent()) {
            throw new NoSuchElementException();
        }

        Article article = findArticle.get();
        return DetailArticleResponse.builder()
                .articleId(article.getId())
                .title(article.getTitle())
                .hit(article.getHit())
                .tag(article.getTag())
                .nickname(article.getMember().getNickname())
                .content(article.getContent())
                .createdDate(article.getCreatedDate())
                .build();
    }

    @Override
    public Integer totalCount() {
        return articleRepository.findCountAll();
    }

    @Override
    public Long editArticle(Long articleId, String loginId, EditArticleDto editArticleDto) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }

        Member member = findMember.get();
        Optional<Article> findArticle = articleRepository.findById(articleId);
        if (!findArticle.isPresent()) {
            throw new NoSuchElementException();
        }

        Article article = findArticle.get();
        if (!article.getMember().getId().equals(member.getId())) {
            throw new IllegalArgumentException();
        }
        article.changeArticle(article.getTitle(), article.getContent());
        return article.getId();
    }

    @Override
    public void increaseHit(Long articleId) {
        Optional<Article> findArticle = articleRepository.findById(articleId);
        if (!findArticle.isPresent()) {
            throw new NoSuchElementException();
        }
        Article article = findArticle.get();
        article.increaseHit();
        articleRepository.update(article);
    }

    @Override
    public Long removeArticle(Long articleId, String loginId) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }

        Member member = findMember.get();
        Optional<Article> findArticle = articleRepository.findById(articleId);
        if (!findArticle.isPresent()) {
            throw new NoSuchElementException();
        }

        Article article = findArticle.get();
        if (!article.getMember().getId().equals(member.getId())) {
            throw new IllegalArgumentException();
        }

        articleRepository.remove(article.getId());
        return article.getId();
    }
}
