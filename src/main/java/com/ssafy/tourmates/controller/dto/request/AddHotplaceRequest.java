package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class AddHotplaceRequest {

    private String name;
    private String desc;
    private String visitedDate;
    private String uploadFileName;
    private String storeFileName;
    private Long memberId;
    private int contentId;
    private int contentTypeId;
}
