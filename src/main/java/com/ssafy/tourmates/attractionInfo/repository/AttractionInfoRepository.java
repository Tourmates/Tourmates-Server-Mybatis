package com.ssafy.tourmates.attractionInfo.repository;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import org.w3c.dom.Attr;

import java.util.List;
import java.util.Optional;

public interface AttractionInfoRepository {

    AttractionInfo save(AttractionInfo attractionInfo);

    Optional<AttractionInfo> findById(Integer contentId);

    void update(AttractionInfo dto);

    void deleteById(int contentId);

    List<AttractionInfo> findByConditions(AttractionInfoSearchRequest condition);
}
