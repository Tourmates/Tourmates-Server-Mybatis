package com.ssafy.tourmates.member.model.service.dto;

import com.ssafy.tourmates.member.model.Authority;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.*;

@Data
@NoArgsConstructor(access = PROTECTED)
public class AddMemberDto {

    private String loginId;
    private String loginPw;
    private String username;
    private String email;
    private String phone;
    private String birth;
    private String gender;
    private String nickname;
    private Authority authority;

    @Builder
    public AddMemberDto(String loginId, String loginPw, String username, String email, String phone, String birth, String gender, String nickname, Authority authority) {
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.nickname = nickname;
        this.authority = authority;
    }
}
