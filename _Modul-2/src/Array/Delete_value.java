package Array;

import java.util.Scanner;

public class Delete_value {
    public static void main(String[] args) {
        int[] value = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Nhập số X cần xóa:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            if (x == value[i]) {
                count++;
            }
        }
        if (count != 0) {
            deleteValue(x, value);
            String show = "Mảng mới là: ";
            for (int i = 0; i < value.length; i++) {
                show += value[i] + " ";
            }
            System.out.println(show);
        } else {
            System.out.println("Số " + x + " không tồn tại trong mảng");
        }
    }

    public static int[] deleteValue(int x, int[] value) {
        int count = 0;
        int i = 0;
        for (; i < value.length; i++) {
            if (x == value[i]) {
                count++;
            }
            if (i > (value.length - 1 - count)) {
                value[i] = 0;
            } else {
                if(value[i + count]!=x) {
                    value[i] = value[i + count];
                }else {
                    count++;
                    value[i] = value[i + count];
                }
            }
        }
        return value;
    }
}
