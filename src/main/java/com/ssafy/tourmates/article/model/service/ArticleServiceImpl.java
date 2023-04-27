package com.ssafy.tourmates.article.model.service;

import com.ssafy.tourmates.article.model.Article;
import com.ssafy.tourmates.article.model.repository.ArticleRepository;
import com.ssafy.tourmates.article.model.service.dto.AddArticleDto;
import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
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
}
