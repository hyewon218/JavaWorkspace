package week03;
// 우리가 클래스를 만들기 위해서는 4가지 STEP이 필요합니다.
// 1. 만들려고 하는 설계도를 선언합니다. (클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드)을 정의합니다.
// 3. 객체를 생성하는 방식을 정의합니다. (생성자) - constructor
// 4. 객체가 가지고 있어야 할 행위(메서드)를 정의합니다.
public class Car {
    // <필드 영역>

    // 1) 고유 데이터 영역
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    // 2) 상태 데이터 영역
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights = true; // 자동차 조명의 상태

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door = new Door();
    Handle handle;

    // <생성자 영역>
    // 생성자 : 처음 객체가 생성될 때 (instance) 어떤 로직을 수행하야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car () {
        // logic
        // 기본생성자 : 생략이 가능

        System.out.println("생성자가 호출되었습니다! 객체가 생성됩니다. ");
    }
    // <메서드 영역>

    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 폐달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }
    double brakePedal() {
        speed = 0;
        return speed;
    }
    char changeGear(char type) {
        gear = type;
        return gear;
    }
    boolean onOffLights() {
        lights = !lights;
        return lights;
    }
    void horn() {
        System.out.println("빵빵");
    }

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {//speeds 안에 있는 배열들이 하나하나 v에 할당됨.
            System.out.println("v = " + v);
        }
    }


}
