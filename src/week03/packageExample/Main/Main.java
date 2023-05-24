package week03.packageExample.Main;

import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        //클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
        Car car = new Car();
        car.horn();

        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
        car2.horn();
    }
}