package com.ssafy.tourmates.attractionInfo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.w3c.dom.Attr;

import java.math.BigDecimal;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class AttractionInfo {
    private int contentId;
    private int sidoCode2;
    private int gugunCode2;
    private int contentTypeId;
    private String title;
    private String addr1;
    private String addr2;
    private String zipcode;
    private String firstImage;
    private String firstImage2;
    private int readCount;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String mlevel;

    @Builder
    public AttractionInfo(int contentId, int sidoCode2, int gugunCode2, int contentTypeId, String title, String addr1, String addr2, String zipcode, String firstImage, String firstImage2, int readCount, BigDecimal latitude, BigDecimal longitude, String mlevel){
        this.contentId = contentId;
        this.sidoCode2 = sidoCode2;
        this.gugunCode2 = gugunCode2;
        this.contentTypeId = contentTypeId;
        this.title = title;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.zipcode = zipcode;
        this.firstImage = firstImage;
        this.firstImage2 = firstImage2;
        this.readCount = readCount;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mlevel = mlevel;
    }
}

