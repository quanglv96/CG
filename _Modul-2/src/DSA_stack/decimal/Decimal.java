package DSA_stack.decimal;


import java.util.Arrays;

public class Decimal {
    private  int[] stack;
    private  int size = 0;
    public Decimal(int numberIn) {
        stack = new int[size];
        while (numberIn != 0) {
            int numberOut = numberIn % 2;
            add(numberOut);
            numberIn = (numberIn - numberOut)/2;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(stack[i] );
        }
    }
    public void add(int number) {
        stack = Arrays.copyOf(stack,size+1);
        stack[size] = number;
        size++;
    }

    public static void main(String[] args) {
        Decimal decimal = new Decimal(15);
    }



}
