package week02.collection;

import java.util.ArrayList;

public class Col1 {
    // List
    // 순서가 있는 데이터의 집합 => Array(최초 길이를 알아야 함!)
    // 처음엘 길이를 몰라도 만들 수 있음!
    // 1) Array -> 정적 배열
    // 2) List(=ArrayList) -> 동적 배열(크기가 가변적으로 늘어난다)
    //     - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
    //     - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니까 상관없다!
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList<Integer>();// 선언 + 생성

        intList.add(99);
        intList.add(15);
        intList.add(3);

        System.out.println(intList.get(0));
        System.out.println(intList.get(1));
        System.out.println(intList.get(2));
        System.out.println("----------");

        //2번째 있는 값(15)를 바꿔보자.
        intList.set(1, 10);
        System.out.println(intList.get(1));

        //삭제
        System.out.println(intList.get(0));//99
        intList.remove(0);
        System.out.println(intList.get(0));//0번째 99가 삭제되고 15가 0번째가 됨(앞으로 밀린다)

        //전체 값 삭제
        System.out.println("클리어 전");
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());//비어있음
    }
}

