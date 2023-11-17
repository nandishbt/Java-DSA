package Sorting;
//findDuplicate

public class CyclicEx6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        System.out.println(search(arr));

    }
    static int search(int[] arr){
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }

        }
        return arr.length;
    }
    static void sort(int[] arr){
        for (int i = 0; i <= arr.length-1 ; i++) {
            while(true){
                if(arr[i]<=0){
                    break;
                }
                if(arr[i] == i+1){
                    break;
                }
                if(arr[i] == arr[arr[i]-1]){
                    break;
                }
                swap(arr,i,arr[i]-1);
            }

        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
