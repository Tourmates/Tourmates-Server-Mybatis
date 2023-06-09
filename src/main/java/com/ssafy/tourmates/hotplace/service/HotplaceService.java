package com.ssafy.tourmates.hotplace.service;

import com.ssafy.tourmates.controller.dto.response.DetailHotplaceResponse;
import com.ssafy.tourmates.controller.dto.response.HotplaceResponse;
import com.ssafy.tourmates.hotplace.service.dto.AddHotplaceDto;
import com.ssafy.tourmates.hotplace.service.dto.ModifyHotplaceDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface HotplaceService {

    Long registerHotplace(String loginId, Integer contentId, AddHotplaceDto dto);

    List<HotplaceResponse> searchHotplaces(int pageNum, int amount);

    List<HotplaceResponse> searchMyHotplaces(Long memberId, int pageNum, int amount);

    DetailHotplaceResponse searchHotplace(Long hotplaceId);

    Long increaseHit(Long hotplaceId);

    Long increaseVote(Long hotplaceId, String loginId);

    Long editHotplace(Long hotplaceId, String loginId, ModifyHotplaceDto dto);

    Long removeHotplace(Long hotplaceId);
}
