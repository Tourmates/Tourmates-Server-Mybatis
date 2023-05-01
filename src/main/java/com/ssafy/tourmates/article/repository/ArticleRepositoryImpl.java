package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ArticleRepositoryImpl implements ArticleRepository {

    private final ArticleMapper articleMapper;

    @Override
    public Article save(Article article) {
        articleMapper.save(article);
        return article;
    }

    @Override
    public Optional<Article> findById(Long articleId) {
        return articleMapper.findById(articleId);
    }

    @Override
    public List<Article> findByCondition(SearchArticleCondition condition) {
        return articleMapper.findByCondition(condition);
    }

    @Override
    public void update(Article article) {
        articleMapper.update(article);
    }

    @Override
    public void remove(Long articleId) {
        articleMapper.remove(articleId);
    }
}
