package com.ssafy.tourmates.article.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class AddArticleDto {

    private String title;
    private String content;
    private String tag;

    @Builder
    public AddArticleDto(String title, String content, String tag) {
        this.title = title;
        this.content = content;
        this.tag = tag;
    }
}
