package com.ssafy.tourmates.hotplace.model.service;

import com.ssafy.tourmates.hotplace.model.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.model.service.dto.ModifyHotplaceDto;

public interface HotplaceService {
    public void add(AddHotplaceDto dto);

    public void edit(ModifyHotplaceDto dto);

    public void delete(Long hotplaceId);
}
