package com.ssafy.tourmates.common.exception;

public class AttractionInfoNotFoundException extends RuntimeException {

    public AttractionInfoNotFoundException() {
        super("관광지 정보가 존재하지 않습니다.");
    }
}
