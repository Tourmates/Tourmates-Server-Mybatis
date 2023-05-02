package com.ssafy.tourmates.attractionInfo.repository;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AttractionInfoRepositoryImpl implements AttractionInfoRepository {

    private final AttractionInfoMapper mapper;


    @Override
    public AttractionInfo save(AttractionInfo attractionInfo) {
        return mapper.save(attractionInfo);
    }

    @Override
    public Optional<AttractionInfo> findById(Integer contentId) {
        return mapper.findById(contentId);
    }

    @Override
    public void update(AttractionInfo attractionInfo) {
        mapper.update(attractionInfo);
    }

    @Override
    public void deleteById(int contentId) {
        mapper.deleteById(contentId);
    }

    @Override
    public List<AttractionInfo> findByConditions(AttractionInfoSearchRequest condition) {

        return mapper.findByConditions(condition);
    }
}
