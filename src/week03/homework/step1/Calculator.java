package week03.homework.step1;

public class Calculator {

    public double calculate(String operator, int firstNumber, int secondNumber) {
        double answer = 0;

        if(operator.equals("+")){
            answer = firstNumber + secondNumber;
        }else if(operator.equals("-")){
            answer = firstNumber - secondNumber;
        }else if(operator.equals("*")){
            answer = firstNumber * secondNumber;
        }else if(operator.equals("/")){
            answer = firstNumber / secondNumber;
        }
        return answer;
    }

}