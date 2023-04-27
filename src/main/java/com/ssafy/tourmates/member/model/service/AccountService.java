package com.ssafy.tourmates.member.model.service;

import com.ssafy.tourmates.member.model.Member;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface AccountService {

    Member login(String loginId, String loginPw);

}
