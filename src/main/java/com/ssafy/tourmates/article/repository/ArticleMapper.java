package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {

    void save(Article article);

    Optional<Article> findById(Long articleId);

    List<Article> findAll();

    Optional<Article> findDetailById(Long articleId);

    List<Article> findByCondition(@Param("condition") SearchArticleCondition condition, @Param("pageNum") int pageNum, @Param("amount") int amount);

    Integer findCountAll();

    void update(Article article);

    void remove(Long articleId);
}
