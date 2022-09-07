package hello.demo.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{  //MemberRepository를 상속받음

    private static Map<Long, Member> store = new HashMap<>(); //long = key Member = value
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }
    @Override
    public Member findById(Long memberId)
    {
        return store.get(memberId);
    }
}
