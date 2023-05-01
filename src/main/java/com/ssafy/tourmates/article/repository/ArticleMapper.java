package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {

    void save(Article article);

    Optional<Article> findById(Long articleId);

    List<Article> findAll();

    List<Article> findByCondition(SearchArticleCondition condition);

    void update(Article article);

    void remove(Long articleId);
}
