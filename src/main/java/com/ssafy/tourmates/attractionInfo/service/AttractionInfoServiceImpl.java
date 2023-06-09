package com.ssafy.tourmates.attractionInfo.service;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.attractionInfo.repository.AttractionInfoRepository;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import com.ssafy.tourmates.common.exception.AttractionInfoNotFoundException;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttractionInfoServiceImpl implements AttractionInfoService {

  private final AttractionInfoRepository attractionInfoRepository;

  @Override
  public List<AttractionInfoDto> searchAttraction(AttractionInfoSearchRequest condition) {

    List<AttractionInfo> findAttractionInfoList = attractionInfoRepository.findByConditions(
        condition);

    return findAttractionInfoList.stream()
        .map(attractionInfo ->
            AttractionInfoDto.builder()
                .title(attractionInfo.getTitle())
                .addr1(attractionInfo.getAddr1())
                .zipcode(attractionInfo.getZipcode())
                .firstImage(attractionInfo.getFirstImage())
                .latitude(attractionInfo.getLatitude())
                .longitude(attractionInfo.getLongitude())
                .build()
        ).collect(Collectors.toList());

  }


  @Override
  public AttractionInfoDto searchAttraction(int contentId) {
    AttractionInfo findAttractionInfo = attractionInfoRepository.findById(contentId)
        .orElseThrow(() -> new AttractionInfoNotFoundException());

    return AttractionInfoDto.builder()
        .id(findAttractionInfo.getContentId())
        .title(findAttractionInfo.getTitle())
        .latitude(findAttractionInfo.getLatitude())
        .longitude(findAttractionInfo.getLongitude())
        .build();
  }

  @Override
  public void delete(int contentId) {

    attractionInfoRepository.deleteById(contentId);
  }


}
