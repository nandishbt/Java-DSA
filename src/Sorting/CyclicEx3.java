package Sorting;
//findDuplicate

public class CyclicEx3 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,4};
        System.out.println(dup(arr));

    }
    static int dup(int[] arr){
        for (int i = 0; i <= arr.length-1 ; i++) {
            while(true){
                if(arr[i] == i+1){
                    break;
                }
                if(arr[i] == arr[arr[i]-1]){
                    return arr[i];
                }
                swap(arr,i,arr[i]-1);
            }

        }return -1;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
