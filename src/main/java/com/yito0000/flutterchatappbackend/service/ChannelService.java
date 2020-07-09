package com.yito0000.flutterchatappbackend.service;

import com.yito0000.flutterchatappbackend.domain.ChannelEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.repository.ChannelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChannelService {

    private final ChannelRepository channelRepository;

    public List<ChannelEntity> fetchChannelListInJoinedMember(MemberId memberId) {
        return channelRepository.fetchByMemberId(memberId);
    }
}
