package com.ssafy.tourmates.attractionInfo.repository;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import org.w3c.dom.Attr;

import java.util.Optional;

public interface AttractionInfoRepository {

    AttractionInfo save(AttractionInfo attractionInfo);

    Optional<AttractionInfo> findById(Long id);

    void update(AttractionInfo dto);

}
