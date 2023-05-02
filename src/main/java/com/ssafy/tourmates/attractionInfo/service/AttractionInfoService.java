package com.ssafy.tourmates.attractionInfo.service;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;

import java.util.List;

public interface AttractionInfoService {


    AttractionInfoDto searchAttraction(int contentId);

    public void delete(int contentId);

    List<AttractionInfoDto> searchAttraction(AttractionInfoSearchRequest condition);
}
