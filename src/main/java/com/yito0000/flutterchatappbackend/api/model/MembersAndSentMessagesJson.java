package com.yito0000.flutterchatappbackend.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MembersAndSentMessagesJson {

    private MemberJson member;

    private MessageJson latestMessage;
}
