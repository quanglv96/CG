package search.searchBinary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(2);
        arr.add(11);
        arr.add(9);
        arr.add(7);
        arr.add(8);
        Collections.sort(arr);
        binarySearch(arr, 3);
    }

    public static void binarySearch(ArrayList<Integer> arr, int value) {
        int left = 0;
        int right = arr.size() - 1;
        int mid = arr.size() / 2;
        int count = 0;
        while (count != 1) {
            if (value > arr.get(mid)) {
                left = 1 + mid;
                mid = left + (right + 1 - left) / 2;
            } else {
                right = mid - 1;
                mid = left + (right + 1 - left) / 2;
            }
            if (value == arr.get(left) || value == arr.get(right) || value == arr.get(mid)) {
                System.out.println("trong mảng có " + value);
                return;
            }
            if(left==right){
                System.out.println("không thấy "+value);
                return;
            }
        }


    }

}

