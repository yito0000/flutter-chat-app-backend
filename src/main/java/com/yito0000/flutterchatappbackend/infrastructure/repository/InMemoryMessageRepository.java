package com.yito0000.flutterchatappbackend.infrastructure.repository;

import com.yito0000.flutterchatappbackend.domain.ChannelId;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.Message;
import com.yito0000.flutterchatappbackend.domain.repository.MessageRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryMessageRepository implements MessageRepository {

    @Override
    public List<Message> fetchLatestMessageByMemberIds(List<MemberId> memberIdList) {

        Message message1 = Message.builder()
                .in(new ChannelId("channel_id1"))
                .from(new MemberId("member_id2"))
                .to(new MemberId("member_id1"))
                .text("test text")
                .updateTime(LocalDateTime.now())
                .build();

        Message message2 = Message.builder()
                .in(new ChannelId("channel_id2"))
                .from(new MemberId("member_id3"))
                .to(new MemberId("member_id1"))
                .text("test text 2")
                .updateTime(LocalDateTime.now())
                .build();

        Message message3 = Message.builder()
                .in(new ChannelId("channel_id3"))
                .from(new MemberId("member_id4"))
                .to(new MemberId("member_id1"))
                .text("test text")
                .updateTime(LocalDateTime.now())
                .build();

        return Arrays.asList(message1, message2, message3);
    }
}
