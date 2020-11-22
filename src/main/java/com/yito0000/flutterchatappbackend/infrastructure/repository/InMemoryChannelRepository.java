package com.yito0000.flutterchatappbackend.infrastructure.repository;

import com.yito0000.flutterchatappbackend.domain.ChannelEntity;
import com.yito0000.flutterchatappbackend.domain.ChannelId;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.repository.ChannelRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryChannelRepository implements ChannelRepository {
    @Override
    public List<ChannelEntity> fetchByMemberId(MemberId id) {

        ChannelEntity channelEntity1 = ChannelEntity.builder()
                .id(new ChannelId("channel_id1"))
                .name("channel 1")
                .isPrivate(false)
                .updateTime(LocalDateTime.now())
                .build();

        ChannelEntity channelEntity2 = ChannelEntity.builder()
                .id(new ChannelId("channel_id2"))
                .name("channel 2")
                .isPrivate(true)
                .updateTime(LocalDateTime.now())
                .build();

        ChannelEntity channelEntity3 = ChannelEntity.builder()
                .id(new ChannelId("channel_id3"))
                .name("channel 3")
                .isPrivate(false)
                .updateTime(LocalDateTime.now())
                .build();

        return Arrays.asList(channelEntity1, channelEntity2, channelEntity3);
    }
}
