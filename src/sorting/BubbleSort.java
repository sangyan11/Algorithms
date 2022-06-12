package sorting;

public class BubbleSort {
    static  void  swap (int [] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort (int [] arr) {
        int n = arr.length;
        for (int i=1;i<n;i++){
            for (int j=0;j<n-i;j++){
                if (arr[j+1]<arr[j]){
               swap(arr,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,4,1};
        bubbleSort(arr);
        for (int a : arr){
            System.out.println(a);
        }
    }
}
