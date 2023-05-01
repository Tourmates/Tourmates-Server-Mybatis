package com.ssafy.tourmates.common.exception;

public class NoticeNotFoundException extends IllegalArgumentException {

    public NoticeNotFoundException() {
        super();

    }

    public NoticeNotFoundException(String message) {
        super(message);
    }

}
