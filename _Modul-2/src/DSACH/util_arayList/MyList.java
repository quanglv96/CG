package DSACH.util_arayList;

public class MyList<E> {
    private int size = 0;
    private static final int default_capacity = 10;
    private Object elements[];

    public MyList() {
    }

    public  MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            E[] newData = (E[]) (new Object[size + 1]);
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }

    public <E> void add(int index, E element) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public <E> void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public <E> int size() {
        return size;
    }

    public Object[] clone() {
        E[] cloneElement = (E[]) new MyList[size];
        for (int i = 0; i < size - 1; i++) {
            cloneElement[i] = (E) elements[i];
        }
        return cloneElement;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void indexOf(E e) {
        Object[] array = new Object[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                array[count] = i;
                count++;
            }
        }
        if (count != 0) {
            System.out.println(e + "xuất hiện ở vị trí: ");
            for (int i = 0; i < count; i++) {
                System.out.print(i + "");
            }
        } else {
            System.out.println(e + "không có trong mảng");
        }
    }

    public boolean checkAdd(E e) {
        boolean count = false;
        for (int i = 0; i < size - 1; i++) {
            if (e.equals(elements[i])) {
                count = true;
            }
        }
        return count;
    }
    public void ensureCapacity(int minCapacity) {
        E[] newElements = (E[]) new Object[minCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
    public <E> Object get(int index){
        return elements[index];
    }
    public E[] clear(){
        E[] newElements = (E[]) new Object[0];
        size = 0;
        elements=newElements;
        return newElements;
    }

}
