package com.ssafy.tourmates.tripplan.repository;

import com.ssafy.tourmates.tripplan.DetailPlan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DetailPlanRepositoryImpl implements DetailPlanRepository {

    private final DetailPlanMapper mapper;

    @Override
    public DetailPlan save(DetailPlan detailPlan) {
        mapper.save(detailPlan);
        return detailPlan;
    }

    @Override
    public List<DetailPlan> findAllById(List<Integer> ids) {
        return mapper.findAllById(ids);
    }
}
