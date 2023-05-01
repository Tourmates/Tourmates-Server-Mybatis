package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {

    Article save(Article article);

    Optional<Article> findById(Long articleId);

    List<Article> findByCondition(SearchArticleCondition condition, int pageNum, int amount);

    List<Article> findByConditionAndMemberId(Long memberId, int pageNum, int amount);

    Optional<Article> findDetailById(Long articleId);

    Integer findCountAll();

    void update(Article article);

    void remove(Long articleId);
}
