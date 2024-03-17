package stayonasDev.practice.demo.project2.service;

import stayonasDev.practice.demo.project1.domain.Member;
import stayonasDev.practice.demo.project1.repository.MemberRepository;
import stayonasDev.practice.demo.project1.repository.MemoryMemberRepository;
import stayonasDev.practice.demo.project1.service.MemberService;
import stayonasDev.practice.demo.project2.AppConfig;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    MemberRepository memberRepository;
    AppConfig appConfig = new AppConfig();

    //추상 메서드만 의존하므로 DIP 원칙 준수
    //저장소가 바뀌어도 AppConfig 만 바꾸면 되기에 개방폐쇠원칙 준수
    public MemberServiceImpl() {
        this.memberRepository = appConfig.memoryMemberRepository();
    }

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
