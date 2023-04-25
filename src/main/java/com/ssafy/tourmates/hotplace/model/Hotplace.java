package com.ssafy.tourmates.hotplace.model;

import static lombok.AccessLevel.PROTECTED;

import com.ssafy.tourmates.member.model.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = PROTECTED)
public class Hotplace {

  private long hotPlaceId;
  private String name;
  private String desc;
  private int hit;
  private int vote;
  private String visitedDate;
  private String uploadFileName;
  private String storeFileName;
  private Member member;
  private int contentId;
  private int contentTypeId;
  private String createdDate;
  private String lastModifiedDate;

  @Builder
  public Hotplace(long hotPlaceId,
      String name,
      String desc,
      int hit,
      int vote,
      String visitedDate,
      String uploadFileName,
      String storeFileName,
      Member member,
      int contentId,
      int contentTypeId,
      String createdDate,
      String lastModifiedDate) {
    this.hotPlaceId = hotPlaceId;
    this.name = name;
    this.desc = desc;
    this.hit = hit;
    this.vote = vote;
    this.visitedDate = visitedDate;
    this.uploadFileName = uploadFileName;
    this.storeFileName = storeFileName;
    this.member = member;
    this.contentId = contentTypeId;
    this.contentTypeId = contentTypeId;
    this.createdDate = createdDate;
    this.lastModifiedDate = lastModifiedDate;
  }
}
