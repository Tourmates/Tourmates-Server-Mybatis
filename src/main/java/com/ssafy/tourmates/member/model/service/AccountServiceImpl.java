package com.ssafy.tourmates.member.model.service;

import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final MemberRepository memberRepository;

    @Override
    public Member login(String loginId, String loginPw) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }
        return findMember.get();
    }
}
