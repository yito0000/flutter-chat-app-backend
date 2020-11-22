package com.yito0000.flutterchatappbackend.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yito0000.flutterchatappbackend.api.model.ChannelJson;
import com.yito0000.flutterchatappbackend.api.model.converter.ChannelJsonConverter;
import com.yito0000.flutterchatappbackend.domain.ChannelEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.service.ChannelService;
import java.time.Duration;
import java.time.LocalTime;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChannelApiController {

    private final ChannelService channelService;

    private final ObjectMapper objectMapper;

    @GetMapping("/api/channels")
    public Flux<ChannelJson> getChannels() {

//        ChannelJson json1 = ChannelJson.builder()
//                .id("id1")
//                .name("channel 1")
//                .isPrivate("false")
//                .updateTime(LocalDateTime.now().toString())
//                .build();
//
//        ChannelJson json2 = ChannelJson.builder()
//                .id("id2")
//                .name("channel 2")
//                .isPrivate("true")
//                .updateTime(LocalDateTime.now().toString())
//                .build();
//
//        ChannelJson json3 = ChannelJson.builder()
//                .id("id3")
//                .name("channel 2")
//                .isPrivate("false")
//                .updateTime(LocalDateTime.now().toString())
//                .build();

        List<ChannelEntity> channelEntityList = channelService.fetchChannelListInJoinedMember(new MemberId("memberid"));
        List<ChannelJson> jsonList = ChannelJsonConverter.convert(channelEntityList);
        return Flux.fromIterable(jsonList);
    }

    @GetMapping(path = "/api/stream-sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> get() {
        return Flux.interval(Duration.ofSeconds(1))
            .map(sequence -> "{\"data\": \"SSE - " + LocalTime.now().toString() + "\"}")
            .log();
    }

}
