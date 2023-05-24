package week03.poly;
// 자식 클래스
public class KiaTire extends Tire{

    public KiaTire(String company) {
        super(company);
    }

    @Override
    public void rideComfort() {
        System.out.println(super.company + " 타이어 승차감은 " + 60);
    }
}
