package com.ssafy.tourmates.article.model.repository;

import com.ssafy.tourmates.article.model.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    void save(Article article);
}
