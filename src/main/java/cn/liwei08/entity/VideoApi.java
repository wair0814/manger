package cn.liwei08.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class VideoApi {
    private Integer apiId;

    private String apiName;

    private Integer apiState;

    private String apiUrl;

    private Integer apiType;

}