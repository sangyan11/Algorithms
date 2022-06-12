package sorting;

import static sorting.BubbleSort.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {2,3,5,4,1};
        selectionSort(arr);
         for (int x : arr){
             System.out.println(x);
         }

    }

    private static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int minInd = i;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j]<arr[minInd]) {
                    minInd = j;
                }
            }
            swap(arr,i,minInd);
        }
    }
}
