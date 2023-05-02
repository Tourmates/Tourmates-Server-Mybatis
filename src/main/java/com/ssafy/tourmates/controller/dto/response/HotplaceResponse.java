package com.ssafy.tourmates.controller.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class HotplaceResponse {

    private Long hotplaceId;
    private String tag;
    private String title;
    private String content;
    private String visitedDate;
    private String storeFileName;

    @Builder
    public HotplaceResponse(Long hotplaceId, String tag, String title, String content, String visitedDate, String storeFileName) {
        this.hotplaceId = hotplaceId;
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.visitedDate = visitedDate;
        this.storeFileName = storeFileName;
    }
}
