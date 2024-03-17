package stayonasDev.practice.demo.project2.repository;

import stayonasDev.practice.demo.project1.domain.Member;
import stayonasDev.practice.demo.project1.repository.MemberRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemoryMemberRepository implements MemberRepository {

    //아직 DI, IOC 의존성 주입x
    private static Map<Long, Member> memberRepository = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public void add(Member member) {
        member.setId(++sequence);
        memberRepository.put(member.getId(), member);
    }


    //TODO
    @Override
    public List<Member> findMemberList() {
        return memberRepository.entrySet().stream().map(map -> map.getValue())
                .collect(Collectors.toList());
    }

    @Override
    public Member findOneMember(Long id) {
        return memberRepository.get(id);
    }
}
