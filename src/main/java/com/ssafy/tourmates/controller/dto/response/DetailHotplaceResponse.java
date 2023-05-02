package com.ssafy.tourmates.controller.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class DetailHotplaceResponse {

    private Long hotplaceId;
    private String tag;
    private String title;
    private String content;
    private int hit;
    private int vote;
    private String createdDate;
    private String visietdDate;
    private String storeFileName;

    private String nickname;

    @Builder
    public DetailHotplaceResponse(Long hotplaceId, String tag, String title, String content, int hit, int vote, LocalDateTime createdDate, String visietdDate, String storeFileName, String nickname) {
        this.hotplaceId = hotplaceId;
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.hit = hit;
        this.vote = vote;
        this.createdDate = createdDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
        this.visietdDate = visietdDate;
        this.storeFileName = storeFileName;
        this.nickname = nickname;
    }
}
