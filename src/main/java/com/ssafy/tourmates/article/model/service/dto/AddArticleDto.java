package com.ssafy.tourmates.article.model.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class AddArticleDto {

    private String title;
    private String content;

    @Builder
    public AddArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
