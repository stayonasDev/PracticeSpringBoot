package stayonasDev.practice.demo.service;

import stayonasDev.practice.demo.repository.MemberRepository;
import stayonasDev.practice.demo.repository.MemoryMemberRepository;

public class MemberService {
    //아직 IOC, DI 및 의존역전 원칙, 개방폐쇠 원칙 미적용
    MemberRepository memberRepository = new MemoryMemberRepository();
    
}
