package com.ssafy.tourmates.tripplan;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.*;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class DetailPlan {

    private Long id;

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    private TripPlan tripPlan;
    private AttractionInfo content;

    @Builder
    public DetailPlan(Long id, LocalDateTime createdDate, LocalDateTime lastModifiedDate, TripPlan tripPlan, AttractionInfo content) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.tripPlan = tripPlan;
        this.content = content;
    }
}
