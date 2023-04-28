package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;

public interface ArticleRepository {

    Article save(Article article);

    void update(Article article);

    void delete(Long articleId);
}
