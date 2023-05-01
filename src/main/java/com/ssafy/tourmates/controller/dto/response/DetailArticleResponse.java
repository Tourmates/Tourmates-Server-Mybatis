package com.ssafy.tourmates.controller.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DetailArticleResponse {

    private Long articleId;
    private String title;
    private String content;
    private int hit;
    private String tag;
    private LocalDateTime createdDate;

    @Builder
    public DetailArticleResponse(Long articleId, String title, String content, int hit, String tag, LocalDateTime createdDate) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.hit = hit;
        this.tag = tag;
        this.createdDate = createdDate;
    }
}
