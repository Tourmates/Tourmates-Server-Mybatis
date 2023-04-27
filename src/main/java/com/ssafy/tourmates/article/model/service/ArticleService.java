package com.ssafy.tourmates.article.model.service;

import com.ssafy.tourmates.article.model.service.dto.AddArticleDto;

public interface ArticleService {

    Long addArticle(String loginId, AddArticleDto dto);
}
