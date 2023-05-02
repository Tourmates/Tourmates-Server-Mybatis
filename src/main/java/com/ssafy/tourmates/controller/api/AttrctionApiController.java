package com.ssafy.tourmates.controller.api;

import com.ssafy.tourmates.attractionInfo.service.AttractionInfoService;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import com.ssafy.tourmates.attractionInfo.service.dto.GugunDto;
import com.ssafy.tourmates.attractionInfo.service.gugun.GugunService;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/attraction")
public class AttrctionApiController {

  private final AttractionInfoService attractionInfoService;
  private final GugunService gugunService;

  @GetMapping("/search")
  public List<AttractionInfoDto> searchAttractionInfo(HttpServletResponse response,
      @RequestParam HashMap<String, String> paramMap) throws IOException {

    int sidoCode = Integer.valueOf(paramMap.get("sidoCode"));
    int gugunCode = Integer.valueOf(paramMap.get("gugunCode"));
    int contentTypeId = Integer.valueOf(paramMap.get("contentTypeId"));

    AttractionInfoSearchRequest condition = AttractionInfoSearchRequest.builder()
        .sidoCode(sidoCode)
        .gugunCode(gugunCode)
        .contentTypeId(contentTypeId)
        .build();

    List<AttractionInfoDto> attractionList = attractionInfoService.searchAttraction(condition);

    return attractionList;
  }

  @GetMapping("/gugun")
  public List<GugunDto> searchGugun(@RequestParam("sidoCode") String sidoCode) {

    List<GugunDto> gugunList = gugunService.searchGuguns(Integer.valueOf(sidoCode));
    return gugunList;
  }


}
