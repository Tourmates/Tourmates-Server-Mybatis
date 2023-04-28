package com.ssafy.tourmates.attractionInfo.service;

import com.ssafy.tourmates.attractionInfo.service.dto.AddAttractionInfoDto;
import com.ssafy.tourmates.attractionInfo.service.dto.ModifyAttractionInfoDto;

public interface AttractionInfoService {

    public void add(AddAttractionInfoDto dto);

    public void edit(ModifyAttractionInfoDto dto);

    public void delete(int contentId);
}
