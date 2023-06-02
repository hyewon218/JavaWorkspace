package week05.thread;

public class Main {
    public static void main(String[] args) {
        // 첫번째 방법. Thread 클래스를 상속받아 실행
//      TestThread thread = new TestThread();
//      thread.start();

        // 두번째 방법. Runnable 인터페이스를 사용하여 쓰레드 실행 (더 많이 쓰임)
//      Runnable run = new TestRunnable();
        // Runnable 객체를 넣어즘
//      Thread thread = new Thread(run);
//      thread.start();

        // 세번째 방법. 람다식을 사용하여 쓰레드 실행
        // 2. task에 담는다!
        Runnable task = () -> {
            // 1. TestThread 클래스에서 run()메서드 역할 부분!
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        // 3. thread를 만들 때 Runnable 객체(task) 를 넣는다!
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");
        // 4. 쓰레드 두개가 병렬적으로 실행되고 있기 때문에
        thread1.start();
        thread2.start();
    }
}


