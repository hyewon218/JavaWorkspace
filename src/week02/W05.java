package week02;
public class W05 {
    public static void main(String[] args) {
        // 변수를 바로 연산해서 그 자리에서 저장하는(대입하는) 연산자
        // =(기본연산자), +=, -=, *= ....(복합대입연산자
        // ++ : += 1
        // -- : -= 1

        int number=10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);
    }
}
