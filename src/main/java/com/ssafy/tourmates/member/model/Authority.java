package com.ssafy.tourmates.member.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Authority {
    CLIENT("CLIENT", "회원"), ADMIN("ADMIN", "관리자");

    private final String key;
    private final String title;
}