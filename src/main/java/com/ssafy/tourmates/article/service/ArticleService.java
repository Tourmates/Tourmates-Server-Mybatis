package com.ssafy.tourmates.article.service;

import com.ssafy.tourmates.article.repository.dto.SearchArticleCondition;
import com.ssafy.tourmates.article.service.dto.AddArticleDto;
import com.ssafy.tourmates.article.service.dto.EditArticleDto;
import com.ssafy.tourmates.controller.dto.response.ArticleResponse;
import com.ssafy.tourmates.controller.dto.response.DetailArticleResponse;

import java.util.List;

public interface ArticleService {

    Long addArticle(String loginId, AddArticleDto dto);

    List<ArticleResponse> searchArticle(SearchArticleCondition condition, int pageNum, int amount);

    DetailArticleResponse detailArticle(Long articleId);

    Integer totalCount();

    Long editArticle(Long articleId, String loginId, EditArticleDto editArticleDto);

    void increaseHit(Long articleId);

    Long removeArticle(Long articleId, String loginId);
}
