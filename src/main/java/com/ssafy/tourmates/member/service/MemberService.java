package com.ssafy.tourmates.member.service;

import com.ssafy.tourmates.controller.dto.response.PersonalInfoResponse;
import com.ssafy.tourmates.member.service.dto.AddMemberDto;
import com.ssafy.tourmates.member.service.dto.EditLoginPwDto;
import com.ssafy.tourmates.member.service.dto.EditPersonalInfoDto;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MemberService {

    Long joinMember(AddMemberDto dto);

    Long editPersonalInfo(String loginId, EditPersonalInfoDto dto);

    Long editLoginPw(String loginId, EditLoginPwDto dto);

    PersonalInfoResponse searchPersonalInfo(String loginId);
}
