package week02.operator;
public class W12 {
    public static void main(String[] args) {
        //중첩 if문
        boolean flag = true;
        int number = 2;

        if (flag) {
            if (number == 1) {
                System.out.println("flag 값은 true이고, number값은 1입니다.");
            } else if (number ==2) {
                System.out.println("flag 값은 true이고, number값은 2입니다.");
            } else {
                System.out.println("flag 값은 true이고, number값은 모르겠습니다.");
            }
        } else {
            if (number == 1) {
                System.out.println("flag 값은 false이고, number값은 1입니다.");
            } else if (number ==2) {
                System.out.println("flag 값은 false이고, number값은 2입니다.");
            } else {
                System.out.println("flag 값은 false이고, number값은 모르겠습니다.");
            }
        }
    }
}
