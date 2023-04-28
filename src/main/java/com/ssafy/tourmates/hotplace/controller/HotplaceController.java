package com.ssafy.tourmates.hotplace.controller;


import com.ssafy.tourmates.hotplace.controller.dto.AddHotplaceRequest;
import com.ssafy.tourmates.hotplace.model.service.HotplaceService;
import com.ssafy.tourmates.hotplace.model.service.dto.AddHotplaceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/hotplace")
public class HotplaceController {

  private HotplaceService hotplaceService;

  public HotplaceController(HotplaceService hotplaceService) {
    this.hotplaceService = hotplaceService;
  }


  @GetMapping("/add")
  public String addHotplace(@RequestBody AddHotplaceRequest request) {

    AddHotplaceDto dto = AddHotplaceDto.builder()
        .name(request.getName())
        .desc(request.getDesc())
        .visitedDate(request.getVisitedDate())
        .uploadFileName(request.getUploadFileName())
        .contentTypeId(request.getContentTypeId())
        .contentTypeId(request.getContentTypeId())
        .build();

    hotplaceService.add(dto);
    return null;
  }
}
