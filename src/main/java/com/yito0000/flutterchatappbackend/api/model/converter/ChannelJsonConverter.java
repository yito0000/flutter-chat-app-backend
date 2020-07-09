package com.yito0000.flutterchatappbackend.api.model.converter;

import com.yito0000.flutterchatappbackend.api.model.ChannelJson;
import com.yito0000.flutterchatappbackend.domain.ChannelEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ChannelJsonConverter {

    public static List<ChannelJson> convert(List<ChannelEntity> list) {
        return list.stream().map(entity -> ChannelJson.builder()
                .id(entity.getId().getValue())
                .name(entity.getName())
                .isPrivate(String.valueOf(entity.isPrivate()))
                .updateTime(entity.getUpdateTime().toString())
                .build()).collect(Collectors.toList());
    }
}
