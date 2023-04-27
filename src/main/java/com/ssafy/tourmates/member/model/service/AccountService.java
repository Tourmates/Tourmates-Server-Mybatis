package com.ssafy.tourmates.member.model.service;

import com.ssafy.tourmates.member.model.Member;

public interface AccountService {

    Member login(String loginId, String loginPw);

}
