package com.weego.main.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongojack.Id;

/**
 * Created by Administrator on 2016/3/29.
 *
 * Ray add POI基本信息
 */
public class POIBaseDetailDto {

    @Id
    private String id;

    @JsonProperty("is_show")
    private boolean isShow;

    @JsonProperty("goole_place_id")
    private String googlePlaceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(boolean isShow) {
        this.isShow = isShow;
    }
}
