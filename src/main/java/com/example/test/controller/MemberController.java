package com.example.test.controller;

import com.example.test.model.Member;
import com.example.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/group/{groupId}")
    public List<Member> getMembersByGroupId(@PathVariable Long groupId) {
        return memberService.findByGroupId(groupId);
    }

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.save(member);
    }

    @PutMapping("/{memberId}")
    public Member editMember(@PathVariable Long memberId, @RequestBody Member member) {
        member.setId(memberId);
        return memberService.save(member);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        memberService.deleteById(memberId);
    }
}