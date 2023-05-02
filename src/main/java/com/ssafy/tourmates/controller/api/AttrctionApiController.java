package com.ssafy.tourmates.controller.api;

import com.ssafy.tourmates.attractionInfo.service.AttractionInfoService;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/attraction")
public class AttrctionApiController {

    private final AttractionInfoService attractionInfoService;

    @GetMapping("/search")
    public String searchAttractionInfo(@RequestParam HashMap<String, Integer> paramMap){

        int contentID = paramMap.get("contentId");
        AttractionInfoDto dto = attractionInfoService.searchAttraction(contentID);

      ///  JSONObject json = new JSONObject();
        return null;

    }

}
