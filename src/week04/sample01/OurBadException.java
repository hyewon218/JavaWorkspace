package week04.sample01;

// 예외 클래스를 만들어서 예외를 정의!!!
public class OurBadException extends Exception{
    // 생성자
    public OurBadException () {
        // 부모 클래스의 생성자를 호출
        super("위험한 행동을 하면 예외처리를 꼭 해야함!");
    }
}
