package hello.basic.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice); // 주문 결과 반환
}
