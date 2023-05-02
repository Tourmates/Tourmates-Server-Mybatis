package com.ssafy.tourmates.controller.dto.request;

import com.ssafy.tourmates.attractionInfo.AttractionInfo;
import lombok.Builder;
import lombok.Data;

@Data
public class AttractionInfoSearchRequest {

    private Integer sidoCode;
    private Integer gugunCode;
    private Integer contentTypeId;

    @Builder
    public AttractionInfoSearchRequest(Integer sidoCode, Integer gugunCode, Integer contentTypeId){
        this.sidoCode = sidoCode;
        this.gugunCode = gugunCode;
        this.contentTypeId = contentTypeId;
    }
}
