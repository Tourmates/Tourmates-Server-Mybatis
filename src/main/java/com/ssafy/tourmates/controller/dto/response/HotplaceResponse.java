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
    private String createdDate;
    private String storeFileName;

    @Builder
    public HotplaceResponse(Long hotplaceId, String tag, String title, String content, LocalDateTime createdDate, String storeFileName) {
        this.hotplaceId = hotplaceId;
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
        this.storeFileName = storeFileName;
    }
}
