package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class EditLoginPwRequest {

    private String oldLoginPw;
    private String newLoginPw;
}
