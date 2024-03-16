package stayonasDev.practice.demo.repository;

import stayonasDev.practice.demo.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemoryMemberRepository implements MemberRepository{

    //아직 DI, IOC 의존성 주입x
    private static Map<Long, Member> memberRepository = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public void add(Member member) {
        memberRepository.put(++sequence, member);
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
