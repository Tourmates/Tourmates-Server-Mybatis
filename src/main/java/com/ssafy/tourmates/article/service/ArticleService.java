package com.ssafy.tourmates.article.service;

import com.ssafy.tourmates.article.service.dto.AddArticleDto;
import com.ssafy.tourmates.article.service.dto.EditArticleDto;

public interface ArticleService {

    Long addArticle(String loginId, AddArticleDto dto);

    Long editArticle(Long articleId, String loginId, EditArticleDto editArticleDto);
}
