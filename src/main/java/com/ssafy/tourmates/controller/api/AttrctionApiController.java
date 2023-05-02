package com.ssafy.tourmates.controller.api;

import com.ssafy.tourmates.attractionInfo.service.AttractionInfoService;
import com.ssafy.tourmates.attractionInfo.service.dto.AttractionInfoDto;
import com.ssafy.tourmates.controller.dto.request.AttractionInfoSearchRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/attraction")
public class AttrctionApiController {

    private final AttractionInfoService attractionInfoService;

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

//        JSONObject json = new JSONObject();
//        JSONArray array = new JSONArray();
//
//        for(AttractionInfoDto attraction : attractionList){
//            JSONObject temp = new JSONObject();
//            temp.put("title", attraction.getTitle());
//            temp.put("addr1", attraction.getAddr1());
//            temp.put("zipcode", attraction.getZipcode());
//            temp.put("firstImage", attraction.getFirstImage());
//            temp.put("latitude", attraction.getLatitude());
//            temp.put("longtitude", attraction.getLongitude());
//            array.add(temp);
//        }
//
//        json.put("data", array);
//
//        response.setContentType("application/json; charset=UTF-8");
//        response.getWriter().println(json);

    }

}
