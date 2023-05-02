package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.attractionInfo.service.AttractionInfoService;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import com.ssafy.tourmates.attractionInfo.service.dto.GugunDto;
import com.ssafy.tourmates.attractionInfo.service.dto.SidoDto;
import com.ssafy.tourmates.attractionInfo.service.gugun.GugunService;
import com.ssafy.tourmates.attractionInfo.service.sido.SidoService;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/attractionInfos")
public class AttractionInfoController {


    private final AttractionInfoService attractionInfoService;
    private final SidoService sidoService;
    private final GugunService gugunService;


    @GetMapping("/search")
    public String search(@RequestParam HashMap<String, Integer> paramMap, Model model){
        int sidoCode = (paramMap.get("sidoCode") == null) ? 1 : paramMap.get("sidoCode");
        int gugunCode =  (paramMap.get("gugunCode") == null) ? 1 : paramMap.get("gugunCode");
        int contentTypeId = (paramMap.get("contentTypeId") == null) ? 12 : paramMap.get("contentTypeId");

        List<SidoDto> sidoList = sidoService.findAll();

        model.addAttribute("sidos", sidoList);

        List<GugunDto> gugunList = gugunService.searchGuguns(sidoCode);

        model.addAttribute("guguns", gugunList);

        AttractionInfoSearchRequest condition = AttractionInfoSearchRequest.builder()
                .sidoCode(sidoCode)
                .gugunCode(gugunCode)
                .contentTypeId(contentTypeId)
                .build();

        List<AttractionInfoDto> attractionInfoDtoList = attractionInfoService.searchAttraction(condition);

        model.addAttribute("attractions", attractionInfoDtoList);

        return "attraction/attractionList";
    }

}
