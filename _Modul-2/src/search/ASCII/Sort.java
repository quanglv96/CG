package search.ASCII;

import java.lang.reflect.Array;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char[] character = (input.nextLine()).toCharArray();
        Map<Integer, Character> hashMap = new HashMap<>();
        for (int i = 0; i < character.length; i++) {
            hashMap.put((int) character[i], character[i]);
        }
        Map<Integer, Character> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap.values());
        Set<Integer> keySet = treeMap.keySet();
        for (Integer key :keySet) {
            System.out.print(treeMap.get(key));
        }
        //sử dụng keySet lấy list Key
        //lặp list key trả ra value
    }
}
