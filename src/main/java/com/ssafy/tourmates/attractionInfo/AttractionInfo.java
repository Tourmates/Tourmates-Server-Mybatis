package com.ssafy.tourmates.attractionInfo;

import com.ssafy.tourmates.common.exception.EditException;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.w3c.dom.Attr;
import sun.tools.tree.ThisExpression;

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
    private BigDecimal longtitude;
    private String mlevel;

    @Builder
    public AttractionInfo(int contentId, int sidoCode2, int gugunCode2, int contentTypeId, String title, String addr1, String addr2, String zipcode, String firstImage, String firstImage2, int readCount, BigDecimal latitude, BigDecimal longtitude, String mlevel){
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
        this.longtitude = longtitude;
        this.mlevel = mlevel;
    }

    //비즈니스 로직 추가
    public void changeContentId(int oldContentId, int NewContentId){
        if(this.contentId != oldContentId){
            throw new EditException();
        }
        this.contentId = NewContentId;
    }

    public void changeSidoCode2(int oldSidoCode2, int newSidoCode2){
        if(this.sidoCode2 != oldSidoCode2){
            throw new EditException();
        }
        this.sidoCode2 = newSidoCode2;
    }

    public void changeGugunCode2(int oldGugunCode2, int newGugunCode2){
        if(this.gugunCode2 != oldGugunCode2){
            throw new EditException();
        }
        this.gugunCode2 = newGugunCode2;
    }

    public void changeContentTypeId(int oldContentTypeId, int newContentTypeId){
        if(this.contentTypeId != oldContentTypeId){
            throw new EditException();
        }
        this.contentTypeId = newContentTypeId;
    }

    public void changeTitle(String oldTitle, String newTitle){
        if(this.title != oldTitle){
            throw new EditException();
        }
        this.title = newTitle;
    }

    public void changeAddr1(String oldAddr1, String newAddr1){
        if(this.addr1 != oldAddr1){
            throw new EditException();
        }
        this.addr1 = newAddr1;
    }

    public void changeAddr2(String oldAddr2, String newAddr2){
        if(this.addr2 != oldAddr2){
            throw new EditException();
        }
        this.addr2 = newAddr2;
    }

    public void changeZipcode(String oldZipcode, String newZipcode){
        if(this.zipcode != oldZipcode){
            throw new EditException();
        }
        this.zipcode = newZipcode;
    }

    public void changeFirstImage(String oldFirstImage, String newFirstImage){
        if(this.firstImage != oldFirstImage){
            throw new EditException();
        }
        this.firstImage = newFirstImage;
    }

    public void changeFirstImage2(String oldFirstImage2, String newFirstImage2){
        if(this.firstImage2 != oldFirstImage2){
            throw new EditException();
        }
        this.firstImage2 = newFirstImage2;
    }

    public void changeLatitude(BigDecimal oldLatitude, BigDecimal newLatitude){
        if(this.latitude != oldLatitude){
            throw new EditException();
        }
        this.latitude = newLatitude;
    }

    public void changeLongtitude(BigDecimal oldLontitude, BigDecimal newLongtitude){
        if(this.longtitude != oldLontitude){
            throw new EditException();
        }
        this.longtitude = newLongtitude;
    }

}

