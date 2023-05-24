package week03.poly;
//부모 클래스
public class Tire {
    String company; // 타이어 회사

    public Tire(String company) {
        this.company = company;
    }

    public void rideComfort() {
        System.out.println(company + " 타이어 승차감은?");
    }
}
