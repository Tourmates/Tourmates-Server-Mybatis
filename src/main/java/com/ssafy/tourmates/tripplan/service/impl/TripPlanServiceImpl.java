package com.ssafy.tourmates.tripplan.service.impl;

import com.ssafy.tourmates.member.Member;
import com.ssafy.tourmates.member.repository.MemberRepository;
import com.ssafy.tourmates.tripplan.DetailPlan;
import com.ssafy.tourmates.tripplan.TripPlan;
import com.ssafy.tourmates.tripplan.repository.DetailPlanRepository;
import com.ssafy.tourmates.tripplan.repository.TripPlanRepository;
import com.ssafy.tourmates.tripplan.service.TripPlanService;
import com.ssafy.tourmates.tripplan.service.dto.AddTripPlanDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TripPlanServiceImpl implements TripPlanService {

    private final TripPlanRepository tripPlanRepository;
    private final DetailPlanRepository detailPlanRepository;
    private final MemberRepository memberRepository;

    @Override
    public Long registerTripPlan(String loginId, List<Integer> contentIds, AddTripPlanDto dto) {

        Member findMember = memberRepository.findByLoginId(loginId)
                .orElseThrow(NoSuchElementException::new);

        TripPlan tripPlan = TripPlan.builder()
                .title(dto.getTitle())
                .member(findMember)
                .build();

        TripPlan savedTripPlan = tripPlanRepository.save(tripPlan);
        return savedTripPlan.getId();
    }
}
