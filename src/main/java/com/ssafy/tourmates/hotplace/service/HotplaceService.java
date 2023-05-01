package com.ssafy.tourmates.hotplace.service;

import com.ssafy.tourmates.controller.dto.response.HotplaceResponse;
import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.service.dto.ModifyHotplaceDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface HotplaceService {

    Long registerHotplace(String loginId, Integer contentId, AddHotplaceDto dto);

    List<HotplaceResponse> searchHotplaces();

    Long increaseHit(Long hotplaceId);

    Long increaseVote(Long hotplaceId, String loginId);

    Long editHotplace(Long hotplaceId, String loginId, ModifyHotplaceDto dto);

    Long removeHotplace(Long hotplaceId);
}
