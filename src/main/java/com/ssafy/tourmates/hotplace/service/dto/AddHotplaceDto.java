package com.ssafy.tourmates.hotplace.service.dto;

import static lombok.AccessLevel.PROTECTED;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AddHotplaceDto {

    private String name;
    private String desc;
    private String visitedDate;
    private String uploadFileName;
    private String storeFileName;
    private Long memberId;
    private int contentId;
    private int contentTypeId;

    @Builder
    public AddHotplaceDto(String name, String desc, String visitedDate, String uploadFileName, String storeFileName, Long memberId, int contentId, int contentTypeId) {
        this.name = name;
        this.desc = desc;
        this.visitedDate = visitedDate;
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
        this.memberId = memberId;
        this.contentId = contentId;
        this.contentTypeId = contentTypeId;
    }
}
