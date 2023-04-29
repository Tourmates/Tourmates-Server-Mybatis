package com.ssafy.tourmates.controller.dto.modify;

import lombok.Data;

@Data
public class ModifyNoticeRequest {

  private String title;
  private String content;
  private boolean top;

}