package com.yito0000.flutterchatappbackend.infrastructure.repository;

import com.yito0000.flutterchatappbackend.domain.ChannelId;
import com.yito0000.flutterchatappbackend.domain.MemberEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.repository.MemberRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryMemberRepository implements MemberRepository {

    @Override
    public MemberEntity fetchMemberById(MemberId memberId) {

        MemberEntity memberEntity = MemberEntity.builder()
                .id(memberId)
                .name("member name")
                .joinedChannelList(Arrays.asList(new ChannelId("channel_id1"), new ChannelId("channel_id2"), new ChannelId("channel_id3")))
                .linkedMemberList(Arrays.asList(new MemberId("member_id1"), new MemberId("member_id2"), new MemberId("member_id3")))
                .build();

        return memberEntity;
    }

    @Override
    public List<MemberEntity> fetchMemberListByIdList(List<MemberId> memberIdList) {

        MemberEntity memberEntity1 = MemberEntity.builder()
                .id(new MemberId("member_id2"))
                .name("member name 2")
                .iconPath("/sample/path")
                .joinedChannelList(Arrays.asList(new ChannelId("channel_id1"), new ChannelId("channel_id2"), new ChannelId("channel_id3")))
                .linkedMemberList(Arrays.asList(new MemberId("member_id1"), new MemberId("member_id2"), new MemberId("member_id3")))
                .updateTime(LocalDateTime.now())
                .build();

        MemberEntity memberEntity2 = MemberEntity.builder()
                .id(new MemberId("member_id3"))
                .name("member name 3")
                .iconPath("/sample/path")
                .joinedChannelList(Arrays.asList(new ChannelId("channel_id1"), new ChannelId("channel_id2"), new ChannelId("channel_id3")))
                .linkedMemberList(Arrays.asList(new MemberId("member_id1"), new MemberId("member_id2"), new MemberId("member_id3")))
                .updateTime(LocalDateTime.now())
                .build();

        MemberEntity memberEntity3 = MemberEntity.builder()
                .id(new MemberId("member_id4"))
                .name("member name 4")
                .iconPath("/sample/path")
                .joinedChannelList(Arrays.asList(new ChannelId("channel_id1"), new ChannelId("channel_id2"), new ChannelId("channel_id3")))
                .linkedMemberList(Arrays.asList(new MemberId("member_id1"), new MemberId("member_id2"), new MemberId("member_id3")))
                .updateTime(LocalDateTime.now())
                .build();

        return Arrays.asList(memberEntity1, memberEntity2, memberEntity3);
    }
}
