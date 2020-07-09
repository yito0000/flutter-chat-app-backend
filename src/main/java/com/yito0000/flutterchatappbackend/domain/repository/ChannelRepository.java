package com.yito0000.flutterchatappbackend.domain.repository;

import com.yito0000.flutterchatappbackend.domain.ChannelEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;

import java.util.List;

public interface ChannelRepository {

    public List<ChannelEntity> fetchByMemberId(MemberId id);
}
