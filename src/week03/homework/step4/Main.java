package week03.homework.step4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(3,5));
        calculator.setOperation(new SubstractOperation());
        System.out.println(calculator.calculate(3,5));
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(3,5));
        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(3,5));
    }
}

