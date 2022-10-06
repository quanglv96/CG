package Array;

import java.util.Scanner;

public class Char_times {
    public static void main(String[] args) {
        String txt="Life is short";
        Scanner input=new Scanner(System.in);
        // chuyển chuỗi thành mảng
        char[] ch=txt.toCharArray();
        System.out.println(" Ký tự cần kiểm tra");
        String textInput=input.nextLine();
        char[] text= textInput.toCharArray();
        int count =0;
        for(int i=0;i< ch.length;i++){
            if(text[0] == ch[i]){
                count++;
            }
        }
        System.out.println("Chữ "+text[0]+" xuất hiện "+count+" lần trong chuỗi.");
    }
}
