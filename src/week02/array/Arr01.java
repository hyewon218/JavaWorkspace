package week02.array;
public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성
        int[] intArray = new int[3]; //{0, 0, 0}
        boolean[] boolArray = new boolean[3]; //{false, false, false}
        String[] stringArray = new String[3]; //{"", "", ""}

        // 배열 선언 먼저! -> 나중에 초기화
        int [] intArray2;
        intArray2 = new int[3]; //{0, 0, 0}

        // 생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회한다.
        // (1) 단건 조회
        System.out.println(intArray[1]);
        System.out.println("-----------");

        // (2) 다건 조회(important!)
        // length : 길이를 구하는 메서드
        for (int i=0; i<intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}

