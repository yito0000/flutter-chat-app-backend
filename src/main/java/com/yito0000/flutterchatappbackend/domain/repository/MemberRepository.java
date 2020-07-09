package com.yito0000.flutterchatappbackend.domain.repository;

import com.yito0000.flutterchatappbackend.domain.MemberEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;

import java.util.List;

public interface MemberRepository {

    public MemberEntity fetchMemberById(MemberId memberId);

    public List<MemberEntity> fetchMemberListByIdList(List<MemberId> memberIdList);
}
