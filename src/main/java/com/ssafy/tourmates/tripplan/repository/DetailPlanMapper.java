package com.ssafy.tourmates.tripplan.repository;

import com.ssafy.tourmates.tripplan.DetailPlan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailPlanMapper {

    void save(DetailPlan detailPlan);
}
