package com.ssafy.tourmates.notice.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ModifyNoticeDto {

    private String title;
    private String content;
    private boolean top;

    @Builder
    public ModifyNoticeDto(String title, String content, boolean top){
        this.title = title;
        this.content = content;
        this.top = top;
    }
}
