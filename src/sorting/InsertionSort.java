package sorting;

import static sorting.BubbleSort.swap;

public class InsertionSort {
    public static void insertionSort(int [] arr) {
        for (int i=1;i<arr.length;i++){
            for (int j=i-1;j>=0;j--){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,4,1};
        insertionSort(arr );
        for (int a : arr){
            System.out.println(a);
        }
    }
}
