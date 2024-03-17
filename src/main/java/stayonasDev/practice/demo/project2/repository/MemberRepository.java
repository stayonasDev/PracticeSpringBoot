package stayonasDev.practice.demo.project2.repository;

import stayonasDev.practice.demo.project1.domain.Member;

import java.util.List;

public interface MemberRepository {
    public abstract void add(Member member);
    public abstract List<Member> findMemberList();
    public abstract  Member findOneMember(Long id);

}
