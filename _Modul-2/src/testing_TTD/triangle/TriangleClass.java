package testing_TTD.triangle;

import java.util.Scanner;

public class TriangleClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Xác định tam giác");
        System.out.print("độ dài canh a:");
        int numA=input.nextInt();
        System.out.print("độ dài canh b:");
        int numB=input.nextInt();
        System.out.print("độ dài canh c:");
        int numC=input.nextInt();
        checkTriangleBoolean(numA,numB,numC);
    }
    public static String checkTriangleBoolean(int numA, int numB, int numC){
        String txt;
        if(numA<(numB+numC) && numA>Math.abs(numB-numC)){
            txt= checkTriangle(numA, numB,  numC);
        }else {
            txt="không phải là tam giác";
        }
        return txt;
    }
    public static String checkTriangle(int numA, int numB, int numC){
        String txt;
        if(numA==numB &&numA==numC){
            txt="tam giác đều";
        }else {
            if(numA!=numB && numA!=numC && numB!=numC){
                txt="tam giác thường";
            }else {
                txt="tam giác cân";
            }
        }
        return txt;
    }
}
