package com.ssafy.tourmates.article.service;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.ArticleRepository;
import com.ssafy.tourmates.article.service.dto.AddArticleDto;
import com.ssafy.tourmates.article.service.dto.EditArticleDto;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

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
                .member(member)
                .build();

        Article savedArticle = articleRepository.save(article);
        return savedArticle.getId();
    }

    @Override
    public Long editArticle(Long articleId, String loginId, EditArticleDto editArticleDto) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }
        Member member = findMember.get();


        return null;
    }
}
