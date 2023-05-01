package com.ssafy.tourmates.controller.dto;

import lombok.Data;

@Data
public class AddMemberRequest {

    private String username;
    private String loginId;
    private String loginPw;
    private String checkLoginPw;
    private String emailId;
    private String emailDomain;
    private String startPhoneNumber;
    private String middlePhoneNumber;
    private String endPhoneNumber;
    private String birth;
    private String gender;
    private String nickname;



    @Data
    public static class ModifyNoticeRequest {

        private String title;
        private String content;
        private boolean top;
    }
}
