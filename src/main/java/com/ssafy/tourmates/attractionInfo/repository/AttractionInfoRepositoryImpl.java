package com.ssafy.tourmates.attractionInfo.repository;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AttractionInfoRepositoryImpl implements AttractionInfoRepository {

    private final AttractionInfoMapper attractionInfoMapper;


    @Override
    public AttractionInfo save(AttractionInfo attractionInfo) {
        return attractionInfoMapper.save(attractionInfo);
    }

    @Override
    public Optional<AttractionInfo> findById(Long id) {
        return attractionInfoMapper.findById(id);
    }

    @Override
    public void update(AttractionInfo attractionInfo) {
        attractionInfoMapper.update(attractionInfo);
    }
}
