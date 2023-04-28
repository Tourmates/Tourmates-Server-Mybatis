package com.ssafy.tourmates.common.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AttractionInfoNotFoundException extends RuntimeException{

    public AttractionInfoNotFoundException(String message){
        super("관광지 정보가 존재하지 않습니다.");
    }
}
