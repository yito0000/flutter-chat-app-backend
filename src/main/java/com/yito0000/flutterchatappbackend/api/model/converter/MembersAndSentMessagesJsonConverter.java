package com.yito0000.flutterchatappbackend.api.model.converter;

import com.yito0000.flutterchatappbackend.api.model.MemberJson;
import com.yito0000.flutterchatappbackend.api.model.MembersAndSentMessagesJson;
import com.yito0000.flutterchatappbackend.api.model.MessageJson;
import com.yito0000.flutterchatappbackend.domain.MemberEntity;
import com.yito0000.flutterchatappbackend.domain.Message;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MembersAndSentMessagesJsonConverter {

    public static List<MembersAndSentMessagesJson> convert(List<MemberEntity> memberList, List<Message> messageList) {

        return memberList.stream().map(entity -> {

            Message message = messageList.stream()
                    .filter(m -> entity.getId().equals(m.getFrom()) || entity.getId().equals(m.getTo()))
                    .findFirst().orElseThrow(RuntimeException::new);

            MemberJson memberJson = MemberJson.builder()
                    .id(entity.getId().getValue())
                    .name(entity.getName())
                    .iconPath(entity.getIconPath())
                    .updateTime(entity.getUpdateTime().toString())
                    .build();

            MessageJson messageJson = MessageJson.builder()
                    .text(message.getText())
                    .updateTime(message.getUpdateTime().toString())
                    .build();

            MembersAndSentMessagesJson membersAndSentMessagesJson = MembersAndSentMessagesJson.builder()
                    .member(memberJson)
                    .latestMessage(messageJson)
                    .build();
            return membersAndSentMessagesJson;

        }).collect(Collectors.toList());
    }
}
