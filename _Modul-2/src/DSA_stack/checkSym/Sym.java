package DSA_stack.checkSym;

import java.util.*;

public class Sym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kiểm tra dấu ngoặc trong biểu thức");
        int choice = -1;
        while (choice != 0) {
            System.out.println("Nhập biểu thức cần kiểm tra");
            String txtIn = input.nextLine();
            checkSym(txtIn);
            choice=1;
            System.out.println("----------");
        }
    }
    public static void checkSym(String txtIn) {
        Stack<Character> arrLeft = new Stack<>();
        Stack<Character> arrRight = new Stack<>();
        char[] arrchar = txtIn.toCharArray();
        for (int i = 0; i < arrchar.length; i++) {
            if (arrchar[i] == '(') {
                arrLeft.push(arrchar[i]);
            }
            if (arrchar[i] == ')') {
                arrRight.push(arrchar[i]);
            }
        }
        //s*(s–a)*(s–b)*(s–c)
        //(–b+(b2–4*a*c)^0.5)/2*a
        if (arrLeft.size() == arrRight.size()) {
            System.out.println("biểu thức đúng");
        } else {
            System.out.println("biểu thức sai");
        }

    }

}
