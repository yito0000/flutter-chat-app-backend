package com.yito0000.flutterchatappbackend.api.controller;

import com.yito0000.flutterchatappbackend.api.model.MembersAndSentMessagesJson;
import com.yito0000.flutterchatappbackend.api.model.converter.MembersAndSentMessagesJsonConverter;
import com.yito0000.flutterchatappbackend.domain.MemberEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.Message;
import com.yito0000.flutterchatappbackend.service.MemberService;
import com.yito0000.flutterchatappbackend.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;

    private final MessageService messageService;

    @GetMapping("/api/member/{member_id}")
    public Flux<MembersAndSentMessagesJson> getMember(@PathVariable("member_id") String paramMemberId) {

        MemberId memberId = new MemberId(paramMemberId);
        List<MemberEntity> memberList = memberService.fetchLinkedMemberList(memberId);
        List<MemberId> memberIdList = memberList.stream().map(entity -> entity.getId()).collect(Collectors.toList());
        List<Message> messageList = messageService.fetchLatestMessage(memberIdList);

        return Flux.fromIterable(MembersAndSentMessagesJsonConverter.convert(memberList, messageList));
    }
}
