package com.ssafy.tourmates.article;

import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Article {

    private Long id;
    private String title;
    private String content;
    private int hit;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

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

    //== 비즈니스 로직 ==//
    public void changeArticle(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void increaseHit() {
        this.hit += 1;
    }
}
