package com.ssafy.tourmates.member.model;

import com.ssafy.tourmates.common.exception.EditException;
import com.ssafy.tourmates.common.model.TimeBaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.*;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Member extends TimeBaseEntity {

    private Long id;
    private String loginId;
    private String loginPw;
    private String username;
    private String email;
    private String phone;
    private String birth;
    private String gender;
    private String nickname;
    private LocalDateTime nicknameLastModifiedDate;
    private Authority authority;

    @Builder
    public Member(Long id, String loginId, String loginPw, String username, String email, String phone, String birth, String gender, String nickname, LocalDateTime nicknameLastModifiedDate, Authority authority) {
        this.id = id;
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.nickname = nickname;
        this.nicknameLastModifiedDate = nicknameLastModifiedDate;
        this.authority = authority;
    }

    //== 비즈니스 로직 ==//
    public void changeLoginPw(String oldLoginPw,String newLoginPw) {
        if (!this.loginPw.equals(oldLoginPw)) {
            throw new EditException();
        }
        this.loginPw = newLoginPw;
    }

    public void changePhone(String phone) {
        this.phone = phone;
    }

    public void changeEmail(String email) {
        this.email = email;
    }
}
