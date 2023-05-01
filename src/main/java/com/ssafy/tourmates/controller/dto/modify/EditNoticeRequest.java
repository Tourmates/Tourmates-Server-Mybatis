package com.ssafy.tourmates.controller.dto.modify;

import lombok.Data;

@Data
public class EditNoticeRequest {

    private String title;
    private String content;
    private boolean top;

}