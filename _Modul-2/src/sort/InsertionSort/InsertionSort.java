package sort.InsertionSort;

public class InsertionSort {
   static int[] arr={1,2,6,5,7,8,4};
public static void insertionSort(int[] arr){
    int pos, x;
    for(int i=1;i< arr.length;i++){
        x=arr[i];
        pos=i;
        while (pos>0&& x<arr[pos-1]){
            arr[pos]=arr[pos-1];
            pos--;
        }
        arr[pos]=x;
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+", ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        insertionSort(arr);
    }

}
