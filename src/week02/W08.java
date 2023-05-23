package week02;
public class W08 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result);
        System.out.println("----------");

        result = x + 10 < y && y < z; //산술연산자인 +가 제일 먼저 계산됨 false &&t rue -> false
        System.out.println(result);
        System.out.println("----------");

        result = x + 2 * 3 > y; //* -> + -> > 순서 8>9 //false
        System.out.println(result);
        System.out.println("----------");

        result = (x + 2) * 3 > y; //+ -> * -> > 순서 12>9 // true
        System.out.println(result);
    }
}
