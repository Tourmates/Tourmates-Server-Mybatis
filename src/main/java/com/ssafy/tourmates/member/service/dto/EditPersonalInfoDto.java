package com.ssafy.tourmates.member.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class EditPersonalInfoDto {

    private String nickname;
    private String email;
    private String phone;

    @Builder
    public EditPersonalInfoDto(String nickname, String email, String phone) {
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
    }
}
