package com.ssafy.tourmates.article.repository;

import com.ssafy.tourmates.article.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    void save(Article article);

    void update(Article article);

    void delete(Long articleId);
}
