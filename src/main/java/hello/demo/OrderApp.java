package hello.demo;

import hello.demo.Order.Order;
import hello.demo.Order.OrderService;
import hello.demo.Order.OrderServiceImpl;
import hello.demo.member.Grade;
import hello.demo.member.Member;
import hello.demo.member.MemberService;
import hello.demo.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = AppConfig.memberService();
        OrderService orderService = AppConfig.orderService();


        Long memberId =1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId,"itemA",10000);
        System.out.println("order = " + order);


    }
}
