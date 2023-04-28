package com.ssafy.tourmates.tripplan.repository;

import com.ssafy.tourmates.tripplan.TripPlan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TripPlanRepositoryImpl implements TripPlanRepository {

    private final TripPlanMapper mapper;

    @Override
    public TripPlan save(TripPlan tripPlan) {
        mapper.save(tripPlan);
        return tripPlan;
    }
}
