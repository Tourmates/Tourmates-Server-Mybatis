package com.ssafy.tourmates.attractionInfo.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class SidoDto {
    private Integer code;
    private String name;

    @Builder
    public SidoDto(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}