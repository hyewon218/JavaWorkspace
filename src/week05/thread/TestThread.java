package week05.thread;

//1. Thread Class를 이용하는 것(상속)
public class TestThread extends Thread{
    @Override
    public void run() {
        // 실제 우리가 쓰레드에서 수행할 작업
        //System.out.println("테스트입니다!!");
        for (int i=0; i<100; i++) {
            System.out.print("*");
        }
    }
}
