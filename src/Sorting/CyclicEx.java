package Sorting;
//finding tha missing element

public class CyclicEx {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int ans = element(arr);
        System.out.println(ans);

    }
    static int element(int[] arr){
        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != i) {
                return i;
            }





        }
        return arr.length;
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while(true){
                if(arr[i] == i){
                    break;
                }
                if(arr[i]> arr.length-1){
                    break;
                }
                else{
                    swap(arr,i,arr[i]);
                }
            }

        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
}
}
