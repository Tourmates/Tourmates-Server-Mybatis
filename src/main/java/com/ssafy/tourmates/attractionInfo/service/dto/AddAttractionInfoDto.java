package com.ssafy.tourmates.attractionInfo.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import static lombok.AccessLevel.PROTECTED;

@Data
@NoArgsConstructor(access = PROTECTED)
public class AddAttractionInfoDto {

    private int sidoCode;
    private int gugunCode;
    private int contentTypeId;
    private String title;
    private String addr1;
    private String addr2;
    private String zipcode;
    private String tel;
    private String firstImage;
    private String firstImage2;
    private int readCount;
    private BigDecimal latitude;
    private BigDecimal longtitude;

    @Builder
    public AddAttractionInfoDto(int sidoCode, int gugunCode, int contentTypeId, String title, String addr1, String addr2, String zipcode,
                                String tel, String firstImage, String firstImage2, int readCount, BigDecimal latitude, BigDecimal longtitude) {
        this.sidoCode = sidoCode;
        this.gugunCode = gugunCode;
        this.contentTypeId = contentTypeId;
        this.title = title;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.zipcode = zipcode;
        this.tel = tel;
        this.firstImage = firstImage;
        this.firstImage2 = firstImage2;
        this.readCount = readCount;
        this.latitude = latitude;
        this.latitude = longtitude;
    }
}
