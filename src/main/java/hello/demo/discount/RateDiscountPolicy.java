package hello.demo.discount;

import hello.demo.member.Grade;
import hello.demo.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {
        int discountRateAmount = 0;
        if (member.getGrade() == Grade.VIP) {
            discountRateAmount = (int) (price * 0.1);
        }
        return discountRateAmount;
    }
}
