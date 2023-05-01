package com.ssafy.tourmates.tripplan.service;

import com.ssafy.tourmates.tripplan.service.dto.AddTripPlanDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TripPlanService {

    Long registerTripPlan(String loginId, List<Integer> contentIds, AddTripPlanDto dto);
}
