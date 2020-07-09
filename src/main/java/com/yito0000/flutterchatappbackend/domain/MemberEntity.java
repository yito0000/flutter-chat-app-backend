package com.yito0000.flutterchatappbackend.domain;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@AllArgsConstructor
@ToString
public class MemberEntity {

    @Getter
    private final MemberId id;

    @Getter
    private String name;

    @Getter
    private String iconPath;

    @Getter
    private List<ChannelId> joinedChannelList;

    @Getter
    private List<MemberId> linkedMemberList;

    @Getter
    private LocalDateTime updateTime;
}
