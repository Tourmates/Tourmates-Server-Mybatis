package com.ssafy.tourmates.attractionInfo.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class GugunDto {

    private Integer code;
    private String name;

    @Builder
    public GugunDto(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
