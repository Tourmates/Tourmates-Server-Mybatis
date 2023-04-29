package com.ssafy.tourmates.member.service.impl;

import com.ssafy.tourmates.common.exception.DuplicateException;
import com.ssafy.tourmates.controller.dto.response.PersonalInfoResponse;
import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberRepository;
import com.ssafy.tourmates.member.service.MemberService;
import com.ssafy.tourmates.member.service.dto.AddMemberDto;
import com.ssafy.tourmates.member.service.dto.EditLoginPwDto;
import com.ssafy.tourmates.member.service.dto.EditPersonalInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
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

    @Override
    public Long editPersonalInfo(String loginId, EditPersonalInfoDto dto) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }
        Member member = findMember.get();
        member.changePersonalInfo(dto.getNickname(), dto.getEmail(), dto.getPhone());
        Long memberId = memberRepository.update(member);
        return memberId;
    }

    @Override
    public Long editLoginPw(String loginId, EditLoginPwDto dto) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }
        Member member = findMember.get();
        member.changeLoginPw(dto.getOldLoginPw(), dto.getNewLoginPw());
        return memberRepository.update(member);
    }

    @Override
    public PersonalInfoResponse searchPersonalInfo(String loginId) {
        Optional<Member> findMember = memberRepository.findByLoginId(loginId);
        if (!findMember.isPresent()) {
            throw new NoSuchElementException();
        }
        Member member = findMember.get();

        String[] email = member.getEmail().split("@");
        String[] phone = member.getPhone().split("-");

        return PersonalInfoResponse.builder()
                .username(member.getUsername())
                .birth(member.getBirth())
                .nickname(member.getNickname())
                .emailId(email[0])
                .emailDomain(email[1])
                .startPhoneNumber(phone[0])
                .middlePhoneNumber(phone[1])
                .endPhoneNumber(phone[2])
                .build();
    }
}
