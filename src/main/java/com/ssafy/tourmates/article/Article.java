package com.ssafy.tourmates.article;

import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Article {

    private Long id;
    private String title;
    private String content;
    private int hit;

    private Member member;

    public Article(Long id) {
        this.id = id;
    }

    @Builder
    public Article(Long id, String title, String content, int hit, Member member) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.hit = hit;
        this.member = member;
    }
}
