package com.ssafy.tourmates.controller.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class ArticleResponse {

    private Long articleId;
    private String title;
    private int hit;
    private String tag;
    private String createdDate;

    @Builder
    public ArticleResponse(Long articleId, String title, int hit, String tag, LocalDateTime createdDate) {
        this.articleId = articleId;
        this.title = title;
        this.hit = hit;
        this.tag = tag;
        this.createdDate = createdDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
    }
}
