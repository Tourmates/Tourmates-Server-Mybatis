package com.ssafy.tourmates.common.exception;

public class MemberNotFoundException extends IllegalArgumentException {

    public MemberNotFoundException() {
        super("회원이 존재하지 않습니다.");
    }
}
