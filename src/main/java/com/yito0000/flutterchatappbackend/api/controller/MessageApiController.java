package com.yito0000.flutterchatappbackend.api.controller;

import com.yito0000.flutterchatappbackend.api.model.MessageJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MessageApiController {

//    @GetMapping("/api/messages")
//    public Flux<MessageJson> getMessages() {
//
////        MessageJson messageJson1 = MessageJson.builder()
////                .id("id1")
////                .value("value1")
////                .dateTime(LocalDateTime.now().toString())
////                .build();
////
////        MessageJson messageJson2 = MessageJson.builder()
////                .id("id2")
////                .value("value2")
////                .dateTime(LocalDateTime.now().toString())
////                .build();
////
////        MessageJson messageJson3 = MessageJson.builder()
////                .id("id3")
////                .value("value3")
////                .dateTime(LocalDateTime.now().toString())
////                .build();
//
//        return Flux.just(messageJson1, messageJson2, messageJson3);
//    }
}
