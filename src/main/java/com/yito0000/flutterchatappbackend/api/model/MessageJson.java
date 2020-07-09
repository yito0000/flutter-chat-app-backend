package com.yito0000.flutterchatappbackend.api.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MessageJson {

    private String text;

    private String updateTime;
}
