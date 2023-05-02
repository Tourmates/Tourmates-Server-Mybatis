package com.ssafy.tourmates.hotplace;

import static lombok.AccessLevel.PROTECTED;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.common.UploadFile;
import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Hotplace {

    private Long id;
    private String tag;
    private String title;
    private String content;
    private int hit;
    private int vote;
    private String visitedDate;
    private UploadFile uploadFile;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    private Member member;
    private AttractionInfo info;

    @Builder
    public Hotplace(Long id, String tag, String title, String content, int hit, int vote, String visitedDate, UploadFile uploadFile, LocalDateTime createdDate, LocalDateTime lastModifiedDate, Member member, AttractionInfo info) {
        this.id = id;
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.hit = hit;
        this.vote = vote;
        this.visitedDate = visitedDate;
        this.uploadFile = uploadFile;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.member = member;
        this.info = info;
    }

    //== 비즈니스 로직 ==//
    public void changeHotplace(String tag, String title, String content, String visitedDate, UploadFile uploadFile) {
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.visitedDate = visitedDate;
        this.uploadFile = uploadFile;
    }

    public void increaseHit() {
        this.hit += 1;
    }

    public void increaseVote() {
        this.vote += 1;
    }
}
