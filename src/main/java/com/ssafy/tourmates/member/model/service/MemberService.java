package com.ssafy.tourmates.member.model.service;

import com.ssafy.tourmates.member.model.service.dto.AddMemberDto;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface MemberService {

    Long joinMember(AddMemberDto dto);
}
