package com.ssafy.tourmates.controller.dto.request;

import lombok.Data;

@Data
public class EditPersonalInfoRequest {

    private String nickname;
    private String emailId;
    private String emailDomain;
    private String startPhoneNumber;
    private String middlePhoneNumber;
    private String endPhoneNumber;
}
