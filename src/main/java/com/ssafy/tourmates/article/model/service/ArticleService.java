package com.ssafy.tourmates.article.model.service;

import com.ssafy.tourmates.article.model.service.dto.AddArticleDto;
import com.ssafy.tourmates.article.model.service.dto.EditArticleDto;

public interface ArticleService {

    Long addArticle(String loginId, AddArticleDto dto);

    Long editArticle(Long articleId, String loginId, EditArticleDto editArticleDto);
}
