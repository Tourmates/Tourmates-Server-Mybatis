package com.ssafy.tourmates.tripplan.repository;

import com.ssafy.tourmates.tripplan.DetailPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailPlanMapper {

    void save(DetailPlan detailPlan);

    List<DetailPlan> findAllById(List<Integer> ids);
}
