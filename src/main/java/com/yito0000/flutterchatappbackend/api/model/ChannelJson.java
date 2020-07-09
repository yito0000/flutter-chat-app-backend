package com.yito0000.flutterchatappbackend.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChannelJson {

    private String id;

    private String name;

    private String isPrivate;

    private String updateTime;
}
