package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;


@Data
public class AddNoticeRequest {

    private String title;
    private String content;
    private boolean top;
}