package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class EditHotplaceRequest {
    private String tag;
    private String title;
    private String content;
    private String visitedDate;
    private MultipartFile attachFile;
}
