package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;

import java.util.Optional;

public interface ArticleRepository {

    Article save(Article article);

    Optional<Article> findById(Long articleId);

    void update(Article article);

    void remove(Long articleId);
}
