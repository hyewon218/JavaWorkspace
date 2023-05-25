package week03.homework.step3;

public class Calculator {
    // 클래스 내부 변수
    // final : 상수처럼 사용(변경되지 않는다.)
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    // 생성자
    // 내부 변수에 대입시켜줌.
    // 생성자를 통해 각각의 연산 클래스 타입의 필드(내부 변수)에 객체를 주입한다.
    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operator, int firstNumber, int secondNumber) {
        double answer = 0;

        if(operator.equals("+")){
            answer = addOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("-")){
            answer = substractOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("*")){
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        }else if(operator.equals("/")) {
            answer = divideOperation.operate(firstNumber, secondNumber);
        }
        return answer;
    }

}