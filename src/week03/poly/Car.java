package week03.poly;

public class Car {
    Tire tire;

    // 생성자에서 무조건 tire 매개변수로 넣기로 되어있음!!
    public Car(Tire tire) {
        this.tire = tire;
    }

    Tire getHankookTire() {
        return new HankookTire("HANKOOK");
    }

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}