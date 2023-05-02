package com.ssafy.tourmates.attractionInfo.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class AttractionInfoDto {

  private int id;
  private int contentTypeId;
  private String title;
  private String addr1;
  private String zipcode;
  private String firstImage;
  private Double latitude;
  private Double longtitude;

  @Builder
  public AttractionInfoDto(int id,
      int contentTypeId,
      String title,
      String addr1,
      String zipcode,
      String firstImage,
      Double latitude,
      Double longtitude) {
    this.id = id;
    this.contentTypeId = contentTypeId;
    this.title = title;
    this.addr1 = addr1;
    this.zipcode = zipcode;
    this.firstImage = firstImage;
    this.latitude = latitude;
    this.longtitude = longtitude;
  }

}
