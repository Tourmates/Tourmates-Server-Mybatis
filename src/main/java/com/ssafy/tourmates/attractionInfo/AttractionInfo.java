package com.ssafy.tourmates.attractionInfo;

import static lombok.AccessLevel.PROTECTED;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class AttractionInfo {

  private int contentId;
  private int contentTypeId;
  private int sidoCode2;
  private int gugunCode2;
  private String title;
  private String addr1;
  private String addr2;
  private String tel;
  private String zipcode;
  private String firstImage;
  private String firstImage2;
  private int readCount;
  private Double latitude;
  private Double longitude;
  private String mlevel;

  @Builder
  public AttractionInfo(int contentId,
      int contentTypeId,
      int sidoCode2,
      int gugunCode2,
      String title,
      String addr1,
      String addr2,
      String tel,
      String zipcode,
      String firstImage,
      String firstImage2,
      int readCount,
      Double latitude,
      Double longitude,
      String mlevel) {
    this.contentId = contentId;
    this.contentTypeId = contentTypeId;
    this.sidoCode2 = sidoCode2;
    this.gugunCode2 = gugunCode2;
    this.title = title;
    this.addr1 = addr1;
    this.addr2 = addr2;
    this.tel = tel;
    this.zipcode = zipcode;
    this.firstImage = firstImage;
    this.firstImage2 = firstImage2;
    this.readCount = readCount;
    this.latitude = latitude;
    this.longitude = longitude;
    this.mlevel = mlevel;
  }

  //비즈니스 로직 추가
  public void change(int newSidoCode2,
      int newGugunCode2,
      int newContentTypeId,
      String newTitle,
      String newAddr1,
      String newAddr2,
      String newTel,
      String newZipcode,
      String newFirstImage,
      String newFirstImage2,
      Double newLatitude,
      Double newLongtitude) {
    this.sidoCode2 = newSidoCode2;
    this.gugunCode2 = newGugunCode2;
    this.contentTypeId = newContentTypeId;
    this.title = newTitle;
    this.addr1 = newAddr1;
    this.addr2 = newAddr2;
    this.tel = newTel;
    this.zipcode = newZipcode;
    this.firstImage = newFirstImage;
    this.firstImage2 = newFirstImage2;
    this.latitude = newLatitude;
    this.longitude = newLongtitude;
  }


}

