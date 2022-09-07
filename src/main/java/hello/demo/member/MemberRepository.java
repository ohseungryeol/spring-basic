package hello.demo.member;

public interface MemberRepository {
    void save(Member member); //회원 저장
    Member findById(Long memberId); //리턴타입은 Member
}
