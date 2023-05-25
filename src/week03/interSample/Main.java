package week03.interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        // B를 호출했더니 A 타입으로 자동 형변환
        A a1 = new B();
        // A로 형변환된 B가 오버라이딩 했던 것을 그대로 호출 할 수 있다
        a1.a();
        // a1은 인터페이스 A 타입(자동 형변환)이기 때문에 a()메서드만 가지고 있음!
        // b()는 A 인터페이스가 가지고 있지 않기 때문에
        // a1.b(); // 불가능

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();
        // b()메서드를 쓰고싶다면?
        b.b(); // 강제 타입변환(B로)으로 사용 가능
        System.out.println();

        // A 인터페이스에 구현체 B를 상속받은 C 대입
        // 원래 C 는 a(),b(),c() 다 가능하지만
        // A 타입으로 자동 형변환되어 b(),c() 불가능!
        A a2 = new C();
        a2.a();
        //a2.b(); // 불가능
        //a2.c(); // 불가능

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();
        // b(), c()를 다시 쓰고싶다면?
        c.b(); // 강제 타입변환으로 사용 가능
        c.c(); // 강제 타입변환으로 사용 가능
    }
}

interface A {
    void a();
}
// A는 B가 implements 하고 있는 인터페이스
// A를 implements 받은 B가 오버라이딩 했던 것을 그대로 호출 할 수 있다
class B implements A {
    // A에서 오버라이드 받은 메서드
    @Override
    public void a() {
        System.out.println("B.a()");
    }
    // B에서 직접 만든 메서드
    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
