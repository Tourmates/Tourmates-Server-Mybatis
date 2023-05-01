package com.ssafy.tourmates.article.repository.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class SearchArticleCondition {

    private String keyword;
    //1: 최신순
    //2: 조회수순
    private int sorted;

    @Builder
    public SearchArticleCondition(String keyword, int sorted) {
        this.keyword = keyword;
        this.sorted = sorted;
    }
}
