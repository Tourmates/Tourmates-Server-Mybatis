package com.ssafy.tourmates.member.service;

import com.ssafy.tourmates.member.service.dto.AddMemberDto;
import com.ssafy.tourmates.member.service.dto.EditLoginPwDto;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MemberService {

    Long joinMember(AddMemberDto dto);

    Long editLoginPw(String loginId, EditLoginPwDto dto);

    Long editPhone(String loginId, String phone);

    Long editEmail(String loginId, String email);

    Long editNickname(String loginId, String nickname);
}
