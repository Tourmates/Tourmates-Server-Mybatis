package com.ssafy.tourmates.controller.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleResponse {

    private Long articleId;
    private String title;
    private int hit;
    private LocalDateTime createdDate;

    @Builder
    public ArticleResponse(Long articleId, String title, int hit, LocalDateTime createdDate) {
        this.articleId = articleId;
        this.title = title;
        this.hit = hit;
        this.createdDate = createdDate;
    }
}
