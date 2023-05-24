package week02.array;
public class Arr08_1 {
    public static void main(String[] args) {
        // 최소값 구하기
        int[] arr = {3, 2, 0, 5, 1};

        // 최소값 초기값 세팅
        int min = arr[0];

        // 최대값 구하기
        for (int num : arr) { //arr에서 하나씩 돌아가면서 num에 할당됨
            if (num < min) { // 반복문 돌면서 나(max)보다 값이 크면 저장
                min = num;
            }
        }
        // 최대값 5 출력
        System.out.println("최소값은 => " + min);
    }
}

