package week03.inter;
public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작
        // (인터페이스로 받고 있음(자동 형변환))
        // TV를 교체하더라도 이 형태만 유지한다면 그대로 기능을 유지할 수 있다.
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();
        mrc.channelUp();
        mrc.volumeDown();
        mrc.volumeUp();
        mrc.turnOnOff();

        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");
        // SamsungTv를 이스턴스로 만들고 있다 -> 자동으로 Tv로 형변환이 될 거다.
        // MultiRemoteController getTV 메서드를 통해 SamsungTv로 강제 형변환해서 줌
        // SamsungTv가 된 것을 다시 자동 형변환 해서 MultiRemoteController samsung 에 담음
        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();
        // 다시 강제 형변환을 통해서 또 바꿔줌
        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();


        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();

        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();

    }
}
