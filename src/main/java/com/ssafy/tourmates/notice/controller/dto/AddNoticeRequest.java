package com.ssafy.tourmates.notice.controller.dto;

import lombok.Data;

@Data
public class AddNoticeRequest {


    private String title;
    private String content;
    private boolean top;
}
