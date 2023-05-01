package com.ssafy.tourmates.hotplace.service;

import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.service.dto.ModifyHotplaceDto;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface HotplaceService {

    Long registerHotplace(String loginId, Integer contentId, AddHotplaceDto dto);

    Long edit(ModifyHotplaceDto dto);

    Long delete(Long hotplaceId);
}
