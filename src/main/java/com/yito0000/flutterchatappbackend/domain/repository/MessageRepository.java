package com.yito0000.flutterchatappbackend.domain.repository;

import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.Message;

import java.util.List;

public interface MessageRepository {

    public List<Message> fetchLatestMessageByMemberIds(List<MemberId> memberIdList);
}
