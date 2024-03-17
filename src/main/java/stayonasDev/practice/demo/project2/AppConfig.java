package stayonasDev.practice.demo.project2;

import stayonasDev.practice.demo.project1.repository.MemberRepository;
import stayonasDev.practice.demo.project1.repository.MemoryMemberRepository;
import stayonasDev.practice.demo.project1.service.MemberService;
import stayonasDev.practice.demo.project1.service.MemberServiceImpl;

public class AppConfig {
    public MemberService memberServiceImpl(){
        return new MemberServiceImpl();
    }

    public MemberRepository memoryMemberRepository(){
        return new MemoryMemberRepository();
    }


}
