package DSA_stack.Palindrome;

import java.util.Objects;

public class Palindrome {
    public static void main(String[] args) {
//        String txtIn = "Able was I ere I saw Elba";
        String txtIn = "Able was I ere I was Able";
        String[] arrIn=txtIn.split(" ");
        check(arrIn);
    }
    public static void check(String[] arrIn){
        int count=0;
        boolean flag=true;
        if(arrIn.length%2!=0){
            count=1;
        }
        for(int i=0;i< (arrIn.length-count)/2;i++){
            if(!Objects.equals(arrIn[i], arrIn[arrIn.length - i - 1])){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(" Là chuỗi Palindrome");
        }else {
            System.out.println(" Không phải chuỗi Palindrome");
        }
    }

}
