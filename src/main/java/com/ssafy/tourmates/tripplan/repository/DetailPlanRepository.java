package com.ssafy.tourmates.tripplan.repository;

import com.ssafy.tourmates.tripplan.DetailPlan;

import java.util.List;

public interface DetailPlanRepository {

    DetailPlan save(DetailPlan detailPlan);

    List<DetailPlan> findAllById(List<Integer> ids);
}
