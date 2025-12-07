package hello.core.member;

public interface MemberRepository {

    /*
    * 회원을 저장한다.
    * */
    void save(Member member);

    /*
    * 회원의 ID로 멤버를 찾는다.
    * */
    Member findById(Long memberId);

}
