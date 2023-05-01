package com.ssafy.tourmates.tripplan;

import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.*;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class TripPlan {

    private Long id;
    private String title;
    private int hit;
    private int vote;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    private Member member;

    @Builder
    public TripPlan(Long id, String title, int hit, int vote, LocalDateTime createdDate, LocalDateTime lastModifiedDate, Member member) {
        this.id = id;
        this.title = title;
        this.hit = hit;
        this.vote = vote;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.member = member;
    }
}
