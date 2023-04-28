package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {

    void save(Article article);

    Optional<Article> findById(Long articleId);

    List<Article> findAll();

    void update(Article article);

    void remove(Long articleId);
}
