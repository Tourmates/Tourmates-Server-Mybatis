package com.ssafy.tourmates.attractionInfo.repository;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

public interface AttractionInfoMapper {

    AttractionInfo save(@Param("attractionInfo") AttractionInfo attractionInfo);

    Optional<AttractionInfo> findById(@Param("id") Long id);
}
