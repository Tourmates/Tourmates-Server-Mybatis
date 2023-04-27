package com.ssafy.tourmates.notice.controller.dto;

import lombok.Data;

@Data
public class ModifyNoticeRequest {

    private String title;
    private String content;
    private boolean top;
}
