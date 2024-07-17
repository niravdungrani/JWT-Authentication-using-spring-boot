package com.example.test.service;

import com.example.test.model.Member;
import com.example.test.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findByGroupId(Long groupId) {
        return memberRepository.findByGroupId(groupId);
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public void deleteById(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}