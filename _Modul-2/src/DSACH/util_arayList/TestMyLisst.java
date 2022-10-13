package DSACH.util_arayList;

public class TestMyLisst <E> {
    public static void main(String[] args) {
        MyList  myList = new MyList(2);
        myList.add(0,0);
        myList.add(1,1);
        myList.add(2,2);
        myList.add(3,3);
        myList.add(4,4);
        System.out.println(" hiển thị size mảng"+ myList.size());
        System.out.println("------");
        System.out.println("in phần tử thứ 0"+myList.get(0));
        System.out.println("------");
        System.out.println("xóa vị trí 3");
        myList.remove(3);
    }




}
