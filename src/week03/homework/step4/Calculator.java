package week03.homework.step4;

public class Calculator {
    // 추상클래스의 타입만 가져오면 됨(추상화의 장점)
    private AbstractOperation operation;

    // 생성자
    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }
    //  더하기, 빼기, 곱하기, 나누기 바꾸기 위해서 메서드 생성
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }
    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}
