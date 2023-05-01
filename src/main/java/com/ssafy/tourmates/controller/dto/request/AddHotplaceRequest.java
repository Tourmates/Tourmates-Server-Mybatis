package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class AddHotplaceRequest {

    private String tag;
    private String title;
    private String content;
    private String visitedDate;
    private String uploadFileName;
    private Integer contentId;
}
