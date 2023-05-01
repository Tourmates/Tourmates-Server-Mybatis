package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class AddArticleRequest {
    private String title;
    private String content;
    private String tag;
}
