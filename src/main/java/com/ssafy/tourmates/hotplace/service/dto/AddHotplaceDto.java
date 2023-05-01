package com.ssafy.tourmates.hotplace.service.dto;

import static lombok.AccessLevel.PROTECTED;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AddHotplaceDto {

    private String tag;
    private String title;
    private String content;
    private String visitedDate;
    private String uploadFileName;

    @Builder
    public AddHotplaceDto(String tag, String title, String content, String visitedDate, String uploadFileName) {
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.visitedDate = visitedDate;
        this.uploadFileName = uploadFileName;
    }
}
