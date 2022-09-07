package hello.demo;

import hello.demo.Order.OrderService;
import hello.demo.Order.OrderServiceImpl;
import hello.demo.discount.FixDiscountPolicy;
import hello.demo.member.MemberService;
import hello.demo.member.MemberServiceImpl;
import hello.demo.member.MemoryMemberRepository;

public class AppConfig { //App전체를 설정하고 구성

    public static MemberService memberService(){
        //멤버서비스 구현체를 생성과 동시에 그 구현체는 메모리멤버리포지토리를 사용한다
        return new MemberServiceImpl(new MemoryMemberRepository()); //멤버서비스 구현체에 메모리 멤버리포지토리를 파라미터로 전달(생성자주입)
    }

    public static OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
