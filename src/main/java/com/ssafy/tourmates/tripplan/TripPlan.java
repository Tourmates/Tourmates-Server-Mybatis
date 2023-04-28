package com.ssafy.tourmates.tripplan;

import com.ssafy.tourmates.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.*;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class TripPlan {

    private Long tripPlanId;
    private String title;
    private int hit;
    private int vote;

    private Member member;

    @Builder
    public TripPlan(Long tripPlanId, String title, int hit, int vote, Member member) {
        this.tripPlanId = tripPlanId;
        this.title = title;
        this.hit = hit;
        this.vote = vote;
        this.member = member;
    }
}
