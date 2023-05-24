package week02.array;

import java.util.Arrays;
public class Arr04 {
    public static void main(String[] args) {
        // 깊은 복사 메서드
        // 2. Arrays.copyOf() 메서드
        int[] a = { 1, 2, 3, 4 };
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.

        a[3] = 0;
        System.out.println(a[3]);// a[3]만 0으로 바뀌고,
        System.out.println(b[3]);// 복사했던 b[3]은 그대로!!
    }
}
