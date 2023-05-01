package com.ssafy.tourmates.hotplace.service;

import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.service.dto.ModifyHotplaceDto;

public interface HotplaceService {

    public void registerHotplace(AddHotplaceDto dto);

    public void edit(ModifyHotplaceDto dto);

    public void delete(Long hotplaceId);
}
