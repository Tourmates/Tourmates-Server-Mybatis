package com.ssafy.tourmates.member.model.repository;

import com.ssafy.tourmates.member.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);

    Optional<Member> findById(Long id);

    List<Member> findAll();
}
