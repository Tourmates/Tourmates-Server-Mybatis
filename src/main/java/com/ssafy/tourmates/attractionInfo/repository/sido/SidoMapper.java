package com.ssafy.tourmates.attractionInfo.repository.sido;

import com.ssafy.tourmates.attractionInfo.service.sido.Sido;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SidoMapper {

    List<Sido> findAll();
}
