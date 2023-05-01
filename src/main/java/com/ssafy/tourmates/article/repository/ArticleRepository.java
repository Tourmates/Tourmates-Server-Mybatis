package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {

    Article save(Article article);

    Optional<Article> findById(Long articleId);

    List<Article> findByCondition(SearchArticleCondition condition);

    void update(Article article);

    void remove(Long articleId);
}
