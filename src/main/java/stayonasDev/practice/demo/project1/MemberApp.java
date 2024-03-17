package stayonasDev.practice.demo.project1;

import stayonasDev.practice.demo.project1.domain.Member;
import stayonasDev.practice.demo.project1.service.MemberService;
import stayonasDev.practice.demo.project1.service.MemberServiceImpl;

import java.time.LocalDate;

public class MemberApp {
    public static void main(String[] args) {
        //DIP 원칙, 개방폐쇠 원칙 미 준수
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member("A1", LocalDate.now());
        Member member2 = new Member("A2", LocalDate.now());

        memberService.join(member);
        memberService.join(member2);

        System.out.println("aaaaaaaa");
        memberService.findMember()
                .forEach(System.out::println);
    }
}
