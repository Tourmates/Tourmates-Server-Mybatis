package com.ssafy.tourmates.member.model.repository;

import com.ssafy.tourmates.member.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.ssafy.tourmates.member.model.Authority.CLIENT;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class MemberRepositoryImplTest {

    @Autowired
    private MemberRepository memberRepository;


    @Test
    void save() {
        Member member = Member.builder()
                .loginId("ssafy")
                .loginPw("12345678")
                .username("김싸피")
                .email("ssafy@ssafy.com")
                .phone("01012345678")
                .birth("010101")
                .gender("1")
                .nickname("광주5반")
                .authority(CLIENT)
                .build();

        memberRepository.save(member);
    }

    @Test
    void findById() {
        Member member = Member.builder()
                .loginId("ssafy")
                .loginPw("12345678")
                .username("김싸피")
                .email("ssafy@ssafy.com")
                .phone("01012345678")
                .birth("010101")
                .gender("1")
                .nickname("광주5반")
                .authority(CLIENT)
                .build();

        Member savedMember = memberRepository.save(member);

        Optional<Member> findMember = memberRepository.findById(savedMember.getId());
        assertThat(findMember).isPresent();
    }
}