package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String loginId;
    private String loginPw;
    private String saveLoginId;
}
