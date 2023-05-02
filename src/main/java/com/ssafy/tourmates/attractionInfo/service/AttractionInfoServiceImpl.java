package com.ssafy.tourmates.attractionInfo.service;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.attractionInfo.repository.AttractionInfoRepository;
import com.ssafy.tourmates.attractionInfo.service.dto.AddAttractionInfoDto;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttractionInfoServiceImpl implements AttractionInfoService {

    private AttractionInfoRepository attractionInfoRepository;

    public AttractionInfoServiceImpl(AttractionInfoRepository attractionInfoRepository) {
        this.attractionInfoRepository = attractionInfoRepository;
    }

    @Override
    @Transactional
    public void add(AddAttractionInfoDto dto) {

        AttractionInfo attractionInfo = AttractionInfo.builder()
                .contentId(dto.getContentTypeId())
                .sidoCode2(dto.getSidoCode())
                .gugunCode2(dto.getGugunCode())
                .contentTypeId(dto.getContentTypeId())
                .title(dto.getTitle())
                .addr1(dto.getAddr1())
                .addr2(dto.getAddr2())
                .zipcode(dto.getZipcode())
                .firstImage(dto.getFirstImage())
                .firstImage2(dto.getFirstImage2())
                .readCount(dto.getReadCount())
                .latitude(dto.getLatitude())
                .longtitude(dto.getLongtitude())
                .build();

        attractionInfoRepository.save(attractionInfo);
    }

    @Override
    public List<AttractionInfoDto> searchAttraction(AttractionInfoSearchRequest condition) {

        List<AttractionInfo> findAttractionInfoList = attractionInfoRepository.findByConditions(condition);
        return null;
    }


    @Override
    public void delete(int contentId) {

        attractionInfoRepository.deleteById(contentId);
    }




}
