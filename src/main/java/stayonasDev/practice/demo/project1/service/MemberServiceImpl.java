package stayonasDev.practice.demo.project1.service;

import stayonasDev.practice.demo.project1.domain.Member;
import stayonasDev.practice.demo.project1.repository.MemberRepository;
import stayonasDev.practice.demo.project1.repository.MemoryMemberRepository;

import java.util.List;

public class MemberServiceImpl implements MemberService{

    //아직 IOC, DI 및 의존역전 원칙, 개방폐쇠 원칙 미적용
    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.add(member);
    }

    @Override
    public Member findOneMember(Long id) {
        return memberRepository.findOneMember(id);
    }

    @Override
    public List<Member> findMember() {
        return memberRepository.findMemberList();
    }
}
