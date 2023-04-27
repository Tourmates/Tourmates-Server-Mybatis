package com.ssafy.tourmates.article.model.repository;

import com.ssafy.tourmates.article.model.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArticleRepositoryImpl implements ArticleRepository {

    private ArticleMapper articleMapper;

    @Override
    public Article save(Article article) {
        articleMapper.save(article);
        return article;
    }
}
