package DSA_stack.treeMap;

public class TreeMap {

    private int size = 0;
    private Object[] treeMap;
    public TreeMap(String input) {
        if (input == null) {
            System.out.println("Null input string");
        } else {
            input = input.toUpperCase();
            treeMap = input.split(" ");
            size = treeMap.length;
        }

    }

    public void add(String e) {
        treeMap[size++] = e;
    }

    public int size() {
        size = treeMap.length;
        return size;
    }

    public void pop(int index) {
        for (int i = index; i < treeMap.length; i++) {
            if (treeMap[i] == treeMap[treeMap.length - 1]) {
                treeMap[i] = null;
                break;
            }
            treeMap[i] = treeMap[i + 1];
        }
        size--;
    }

    public String get(int index) {
        return (String) treeMap[index];
    }
}
