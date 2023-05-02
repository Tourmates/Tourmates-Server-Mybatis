package com.ssafy.tourmates.attractionInfo.repository;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AttractionInfoMapper {

    AttractionInfo save(@Param("attractionInfo") AttractionInfo attractionInfo);

    Optional<AttractionInfo> findById(@Param("id") int id);

    void update(@Param("attractionInfo") AttractionInfo attractionInfo);

    void deleteById(@Param("contentId") int contentId);

    List<AttractionInfo> findByConditions(@Param("condition") AttractionInfoSearchRequest condition);
}
