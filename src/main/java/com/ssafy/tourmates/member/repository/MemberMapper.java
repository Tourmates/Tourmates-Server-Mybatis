package com.ssafy.tourmates.member.repository;

import com.ssafy.tourmates.member.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);

    Optional<Member> findById(Long id);

    List<Member> findAll();

    Optional<Member> findByLoginId(String loginId);

    Optional<Member> findByPhone(String phone);

    Optional<Member> findByNickname(String nickname);

    Optional<Member> findByEmail(String email);

    void update(Member member);

    void remove(Long memberId);
}
