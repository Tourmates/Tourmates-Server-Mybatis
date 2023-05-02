package com.ssafy.tourmates.controller;

import com.ssafy.tourmates.attractionInfo.service.AttractionInfoService;
import com.ssafy.tourmates.attractionInfo.service.dto.SidoDto;
import com.ssafy.tourmates.attractionInfo.service.sido.SidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller("/attraction")
@RequiredArgsConstructor
public class AttractionInfoController {


    private final AttractionInfoService attractionInfoService;
    private final SidoService sidoService;


    @GetMapping("/search")
    public String search(@RequestParam HashMap<String, Integer> paramMap){
        int sidoCode = paramMap.get("sidoCode");
        int gugunCode = paramMap.get("gugunCode");
        int contentTypeId = paramMap.get("contentTypeId");

        List<SidoDto> sidoList = sidoService.findAll();

        return null;
    }

}
