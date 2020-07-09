package com.yito0000.flutterchatappbackend.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChannelEntity {

    @Getter
    private ChannelId id;

    @Getter
    private String name;

    @Getter
    private boolean isPrivate;

    @Getter
    private LocalDateTime updateTime;
}
