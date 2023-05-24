package week02.homework;

import java.util.*;

public class homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String col = sc.nextLine();
        String title = sc.nextLine();

        switch (col) {
            case "List":
                ArrayList<String> recipeList = new ArrayList<String>();
                while (true) {
                    String scRecipe = sc.nextLine();
                    if (scRecipe.equals("끝")) {
                        break;
                    }
                    recipeList.add(scRecipe);//리스트에 추가
                }
                title = "[" + col + "으로 저장된 " + title + " ]";
                System.out.println(title);
                for (int i = 0; i < recipeList.size(); i++) {
                    System.out.println(i + 1 + ". " + recipeList.get(i));
                }
                break;
            case "Set":
                LinkedHashSet<String> recipeSet = new LinkedHashSet<>();
                while (true) {
                    String scRecipe = sc.nextLine();
                    if (scRecipe.equals("끝")) {
                        break;
                    }
                    recipeSet.add(scRecipe);//리스트에 추가
                }
                title = "[" + col + "으로 저장된 " + title + " ]";
                System.out.println(title);
                Iterator iterator = recipeSet.iterator();

                for (int i = 0; i < recipeSet.size(); i++) {
                    System.out.println(i + 1 + ". " + iterator.next());
                }
                break;
            case "Map":
                Map<Integer, String> recipeMap = new HashMap<>();
                int lineNumber = 1;

                while (true) {
                    String scRecipe = sc.nextLine();
                    if (scRecipe.equals("끝")) {
                        break;
                    }
                    recipeMap.put(lineNumber++, scRecipe);
                }
                title = "[" + col + "으로 저장된 " + title + " ]";
                System.out.println(title);

                for (int i = 0; i < recipeMap.size(); i++) {
                    System.out.println(i + 1 + ". " + recipeMap.get(i+1));
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}
