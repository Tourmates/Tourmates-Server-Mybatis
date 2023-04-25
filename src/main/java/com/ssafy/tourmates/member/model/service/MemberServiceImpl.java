package com.ssafy.tourmates.member.model.service;

import com.ssafy.tourmates.common.exception.DuplicateException;
import com.ssafy.tourmates.member.model.Member;
import com.ssafy.tourmates.member.model.repository.MemberRepository;
import com.ssafy.tourmates.member.model.service.dto.AddMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Long joinMember(AddMemberDto dto) {
        Optional<Member> loginId = memberRepository.findByLoginId(dto.getLoginId());
        if (loginId.isPresent()) {
            throw new DuplicateException();
        }

        Optional<Member> phone = memberRepository.findByPhone(dto.getPhone());
        if (phone.isPresent()) {
            throw new DuplicateException();
        }

        Optional<Member> nickname = memberRepository.findByNickname(dto.getNickname());
        if (nickname.isPresent()) {
            throw new DuplicateException();
        }

        Optional<Member> email = memberRepository.findByEmail(dto.getEmail());
        if (email.isPresent()) {
            throw new DuplicateException();
        }

        Member member = Member.builder()
                .loginId(dto.getLoginId())
                .loginPw(dto.getLoginPw())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .birth(dto.getBirth())
                .gender(dto.getGender())
                .nickname(dto.getNickname())
                .authority(dto.getAuthority())
                .build();

        Member savedMember = memberRepository.save(member);
        return savedMember.getId();
    }
}
