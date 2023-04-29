package com.ssafy.tourmates.controller.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
public class PersonalInfoResponse {

    private String username;
    private String birth;
    private String nickname;
    private String emailId;
    private String emailDomain;
    private String startPhoneNumber;
    private String middlePhoneNumber;
    private String endPhoneNumber;

    @Builder
    public PersonalInfoResponse(String username, String birth, String nickname, String emailId, String emailDomain, String startPhoneNumber, String middlePhoneNumber, String endPhoneNumber) {
        this.username = username;
        this.birth = birth;
        this.nickname = nickname;
        this.emailId = emailId;
        this.emailDomain = emailDomain;
        this.startPhoneNumber = startPhoneNumber;
        this.middlePhoneNumber = middlePhoneNumber;
        this.endPhoneNumber = endPhoneNumber;
    }
}
