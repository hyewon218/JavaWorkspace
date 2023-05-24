package week03.hasExample;

public class Main {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car car = new Car("GV80", "Black", 50000000);

        // 타이어 배열을 만들어 줌
        // 일 대 다 관계, has 관언
        // 자동차 부품 : 타이어, 차문, 핸들 선언
        Tire[] tires = new Tire[]{
                new Tire("KIA", 150000), new Tire("금호", 150000),
                new Tire("Samsung", 150000), new Tire("LG", 150000)
        };
        Door[] doors = new Door[]{
                new Door("LG", "FL"), new Door("KIA", "FR"),
                new Door("Samsung", "BL"), new Door("LG", "BR")
        };
        Handle handle = new Handle("Samsung", "S");


        // 자동차 객체에 부품 등록
        car.setTire(tires); // tires는 tire를 4개 가지고 있는 배열
        car.setDoor(doors);
        car.setHandle(handle);

        // 등록된 부품 확인하기
        for (Tire tire : car.tire) { // car.tire는 배열, 배열에서 요소 하나하나가 나오면서 tire에 할당됨
            System.out.println("tire.company = " + tire.company);
        }
        System.out.println();

        for (Door door : car.door) {
            System.out.println("door.company = " + door.company);
            System.out.println("door.location = " + door.location);
            System.out.println();
        }
        System.out.println();

        // 자동차 핸들 인스턴스 참조형 변수에 저장
        Handle carHandle = car.handle; // car로부터 handle을 얻어오는데, car에 setHandle을 통해서 얻어오게 된다.
        System.out.println("carHandle.company = " + carHandle.company);
        System.out.println("carHandle.type = " + carHandle.type + "\n");

        // 자동차 핸들 조작해보기
        carHandle.turnHandle("Right");
        carHandle.turnHandle("Left");
    }
}
