package hello.demo.discount;

import hello.demo.member.Grade;
import hello.demo.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void vip_o(){
        //given
        Member member = new Member(1L, "MemberVip", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        org.assertj.core.api.Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 X")

    void vip_x(){
        Member member = new Member(1L, "MemberVip", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        org.assertj.core.api.Assertions.assertThat(discount).isEqualTo(1000);
    }
}