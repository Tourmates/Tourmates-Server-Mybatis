package com.ssafy.tourmates.tripplan.repository;

import com.ssafy.tourmates.tripplan.TripPlan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TripPlanMapper {

    void save(TripPlan tripPlan);
}
