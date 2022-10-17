package DSA_stack.treeMap;


public class test {
    public static void main(String[] args) {
        String input = "All in all Sentence by sentence Mouth to mouth";
        TreeMap treeMap = new TreeMap(input);
        System.out.println(treeMap.size());
        while (treeMap.size() !=0){
            String temp = treeMap.get(0);
            int count=0;
            for (int j = 0; j < treeMap.size(); j++) {
                if (temp.equals(treeMap.get(j))) {
                    count++;
                    treeMap.pop(j);
                }
            }
            System.out.println("chữ " + temp + " xuất hiện: " + count + " lần");
            if(treeMap.get(0)==null){
                break;
            }
        }
    }
}
