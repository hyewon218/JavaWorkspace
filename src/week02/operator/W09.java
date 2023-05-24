package week02.operator;
public class W09 {
    public static void main(String[] args) {
        short x = 10;
        int y = 20;

        int z = x + y;//short는 int에 속하기 때문에(int로 형변환됨))

        long lx = 30L;//long 타입은 항상 접미사가 붙어야 한다!!
        long lz = z + lx;//int형은 long타입에 속하기 때문에(long으로 형변환됨)

        float fx = x;//short는 float에 속한다(float로 형변환됨)
        float fy = y;//int는 float에 속한다(float로 형변환됨)
        float fz = x;//int는 float에 속한다(float로 형변환됨)

        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
    }
}
