package com.yito0000.flutterchatappbackend.service;

import com.yito0000.flutterchatappbackend.domain.MemberEntity;
import com.yito0000.flutterchatappbackend.domain.MemberId;
import com.yito0000.flutterchatappbackend.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberEntity> fetchLinkedMemberList(MemberId memberId) {

        MemberEntity memberEntity = memberRepository.fetchMemberById(memberId);

        List<MemberEntity> memberEntityList = memberRepository.fetchMemberListByIdList(memberEntity.getLinkedMemberList());

        return memberEntityList;
    }
}
