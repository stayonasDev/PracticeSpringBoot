package stayonasDev.practice.demo.MemberJoin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import stayonasDev.practice.demo.project1.domain.Member;
import stayonasDev.practice.demo.project1.service.MemberService;
import stayonasDev.practice.demo.project1.service.MemberServiceImpl;

import static org.assertj.core.api.Assertions.*;

@DisplayName("메모리로 회원 가입, 조회 테스트")
public class MemberJoinTest {

    @Test
    public void join() {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member("A1", LocalDate.now());
        Member member2 = new Member("A2", LocalDate.now());

        memberService.join(member);
        memberService.join(member2);

        System.out.println("1 번 회원 조회");
        System.out.println(memberService.findOneMember(1L));

        System.out.println("\n\n 전체 회원 조회");
        memberService.findMember().forEach(i -> System.out.println(i));


//        assertThat(memberService.findOneMember(1L))
//                .isEqualTo(memberService.findOneMember(2L));
    }
}
