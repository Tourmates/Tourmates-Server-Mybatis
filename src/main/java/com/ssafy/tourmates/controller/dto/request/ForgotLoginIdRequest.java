package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class ForgotLoginIdRequest {

    private String emailId;
    private String emailDomain;
    private String startPhoneNumber;
    private String middlePhoneNumber;
    private String endPhoneNumber;
}
