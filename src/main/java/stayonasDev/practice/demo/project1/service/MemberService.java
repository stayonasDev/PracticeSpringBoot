package stayonasDev.practice.demo.project1.service;

import stayonasDev.practice.demo.project1.domain.Member;

import java.util.List;

public interface MemberService {
    public abstract void join(Member member);
    public abstract Member findOneMember(Long id);
    public abstract List<Member> findMember();
}
