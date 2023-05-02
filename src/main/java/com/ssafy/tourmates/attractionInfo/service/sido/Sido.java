package com.ssafy.tourmates.attractionInfo.service.sido;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Sido {

    private Integer code;
    private String name;

    @Builder
    public Sido(Integer code, String name){
        this.code = code;
        this.name = name;
    }
}
