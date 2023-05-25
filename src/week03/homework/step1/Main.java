package week03.homework.step1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator  = new Calculator();
        System.out.println(calculator.calculate("+", 10, 20));
        System.out.println(calculator.calculate("*", 10, 20));
    }
}