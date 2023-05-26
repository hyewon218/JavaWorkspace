package week04.homework;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        // 구현 2.
        // CalculatorApp.start();가 끝나고 나서 return 값을 받아서
        // calculateEnded를 바꿔주게 되면, 내부로직을 빠져나오게 됨.
        // 그래서 계산기가 끝나게 됨
        // while () : 사용자의 입력을 대기(?)하기 위해서
        // 더이상 calculateEnded는 false가 아니기 때문에 내부로직으로 들어오지 않게 됨, 바깥으로 빠짐
        while (!calculateEnded) {
            try {
                // cCalculatorApp.start(); true로 반환되어 calculateEnded=true while로 감
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

