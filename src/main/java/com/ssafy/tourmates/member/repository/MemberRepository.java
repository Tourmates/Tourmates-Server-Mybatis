package com.ssafy.tourmates.member.repository;

import com.ssafy.tourmates.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);

    List<Member> findAll();

    Optional<Member> findByLoginId(String loginId);

    Optional<Member> findByPhone(String phone);

    Optional<Member> findByNickname(String nickname);

    Optional<Member> findByEmail(String email);

    Optional<Member> findByPhoneAndEmail(String phone, String email);

    Long update(Member member);

    Long remove(Long memberId);
}
