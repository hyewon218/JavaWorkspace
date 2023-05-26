package week04.homework;

import java.util.Scanner;

public class CalculatorApp {

    // static으로 되어있어서 별로도 인스턴스화를 시켜주지 않아도 CalculatorApp.start()를 이용해서 구동시킬 수 있다.
    // throws Exception 으로 위험표시가 되어있기 때문에 try~catch로 감싸줘야 한다.
    // start를 끝나고 나면 boolean 타입으로 return
    public static boolean start() throws Exception{
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        String firstInput = scanner.nextLine();
        parser.parseFirstNum(firstInput);

        System.out.println("연산자를 입력해주세요!");
        String operator = scanner.nextLine();
        parser.parseOperator(operator);

        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = scanner.nextLine();
        parser.parseSecondNum(secondInput);

        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;
    }
}

