package week02.array;
public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = { 1, 2, 3, 4 };
        int[] b = a; // 얕은 복사(a와 b는 똑같은 주소값를 바라보게 됨)

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.
    }
}
