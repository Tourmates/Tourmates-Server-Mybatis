package com.ssafy.tourmates.attractionInfo.repository.gugun;

import com.ssafy.tourmates.attractionInfo.service.gugun.Gugun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GugunMapper {

    List<Gugun> findBySidoCode(@Param("sidoCode") int sidoCode);
}
