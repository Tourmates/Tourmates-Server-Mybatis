package com.ssafy.tourmates.article.model.service.dto;

import lombok.Data;

@Data
public class EditArticleDto {

    private String title;
    private String content;

    public EditArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
