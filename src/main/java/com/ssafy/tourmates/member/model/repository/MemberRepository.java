package com.ssafy.tourmates.member.model.repository;

import com.ssafy.tourmates.member.model.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);

    List<Member> findAll();
}
