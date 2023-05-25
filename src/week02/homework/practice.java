package week02.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        // ArrayList 연습해보기!
        // 입력값
        // - 내가 좋아하는 요리 제목을 먼저 입력합니다.
        // - 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
        // - 입력을 마쳤으면 마지막에 “끝”문자를 입력합니다.
        // 출력값
        // - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
        // - 이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        ArrayList<String> recipeList = new ArrayList<String>();

        while (true) {
            String scRecipe = sc.nextLine();
            // "끝" 글자를 배열에 넣기 전에 break
            if (scRecipe.equals("끝")) {
                break;
            }
            recipeList.add(scRecipe);//리스트에 추가
        }

        title = "[ ArrayList로 저장된 " + title + " ]";
        System.out.println(title);
        for (int i = 0; i < recipeList.size(); i++) {
            System.out.println((i + 1) + ". " + recipeList.get(i));
        }
    }
}
