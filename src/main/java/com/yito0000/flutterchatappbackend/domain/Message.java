package com.yito0000.flutterchatappbackend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder
@ToString
public class Message {

    @Getter
    private ChannelId in;

    @Getter
    private MemberId from;

    @Getter
    private MemberId to;

    @Getter
    private String text;

    @Getter
    private LocalDateTime updateTime;
}
