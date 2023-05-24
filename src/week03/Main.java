package week03;
public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        System.out.println("폐달 밟기 전 car.gear = " + car.gear);
        // 메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights); //최초에 true였으므로 반대

        System.out.println();
        System.out.println("폐달 밟고 난 후의 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 150);
    }
}

// 출력
//car.gear = P
//car.gear = N
//car.gear = D
