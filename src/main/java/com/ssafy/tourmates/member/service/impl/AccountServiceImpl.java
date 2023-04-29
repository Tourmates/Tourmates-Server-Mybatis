package com.ssafy.tourmates.member.service.impl;

import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberRepository;
import com.ssafy.tourmates.member.service.AccountService;
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

    @Override
    public String findLoginId(String phone, String email) {
        Optional<Member> findMember = memberRepository.findByPhoneAndEmail(phone, email);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }
        return findMember.get().getLoginId();
    }

    @Override
    public String findLoginPw(String loginId, String phone, String email) {
        Optional<Member> findMember = memberRepository.findByPhoneAndEmail(phone, email);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }

        Member member = findMember.get();
        if (!member.getLoginId().equals(loginId)) {
            throw new NoSuchElementException();
        }

        return member.getLoginPw();
    }
}
