package com.ssafy.tourmates.member.repository.impl;

import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberMapper;
import com.ssafy.tourmates.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberMapper memberMapper;

    @Override
    public Member save(Member member) {
        memberMapper.save(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return memberMapper.findById(id);
    }

    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }

    @Override
    public Optional<Member> findByLoginId(String loginId) {
        return memberMapper.findByLoginId(loginId);
    }

    @Override
    public Optional<Member> findByPhone(String phone) {
        return memberMapper.findByPhone(phone);
    }

    @Override
    public Optional<Member> findByNickname(String nickname) {
        return memberMapper.findByNickname(nickname);
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return memberMapper.findByEmail(email);
    }

    @Override
    public Optional<Member> findByPhoneAndEmail(String phone, String email) {
        return memberMapper.findByPhoneAndEmail(phone, email);
    }

    @Override
    public Long update(Member member) {
        memberMapper.update(member);
        return member.getId();
    }

    @Override
    public Long remove(Long memberId) {
        memberMapper.remove(memberId);
        return memberId;
    }
}
