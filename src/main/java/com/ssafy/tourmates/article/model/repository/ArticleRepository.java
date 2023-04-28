package com.ssafy.tourmates.article.model.repository;

import com.ssafy.tourmates.article.model.Article;

public interface ArticleRepository {

    Article save(Article article);

    void update(Article article);
}
