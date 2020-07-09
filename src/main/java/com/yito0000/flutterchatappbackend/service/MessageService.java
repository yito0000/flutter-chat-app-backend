package com.yito0000.flutterchatappbackend.service;

import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.Message;
import com.yito0000.flutterchatappbackend.domain.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public List<Message> fetchLatestMessage(List<MemberId> memberIdList) {
        return messageRepository.fetchLatestMessageByMemberIds(memberIdList);
    }
}
