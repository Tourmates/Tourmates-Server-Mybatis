package com.ssafy.tourmates.hotplace.service.dto;

import static lombok.AccessLevel.PROTECTED;

import com.ssafy.tourmates.common.UploadFile;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AddHotplaceDto {

    private String tag;
    private String title;
    private String content;
    private String visitedDate;
    private UploadFile uploadFile;

    @Builder
    public AddHotplaceDto(String tag, String title, String content, String visitedDate, UploadFile uploadFile) {
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.visitedDate = visitedDate;
        this.uploadFile = uploadFile;
    }
}
