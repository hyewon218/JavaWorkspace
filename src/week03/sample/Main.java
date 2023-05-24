package week03.sample;

// 지역변수
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        // 두 값이 누적되지 않고 같은 값으로 나온다 -> 지역변수
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }
    // 기본 생성자
    public Main () {}

    //메서드
    public int getNumber () {
        // [지역변수] <-> [전역변수(static)]
        // 헤당 메서드가 실행될 때마다 독립적인 값을 저장하고 관리한다.
        // 이 지역변수는 메서드 내부에서 정의될 때 생성된다.
        // 이 메서드가 종료될 때 소멸된다.
        int number = 1;
        number += 1; // number = number + 1
        return number;
    }
}
