package BitManipulation;

public class Binary {
    public static void main(String[] args) {
        int[] nums = {4,5,6,1,2,3};
        System.out.println(binary(nums,6,0,5));
        
    }
    static int binary(int[] arr,int target,int start,int end){
        if(start>=end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return binary(arr,target,start,mid);
            }
            else {
                return binary(arr,target,mid+1,end);

            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return binary(arr,target,mid,end);

        }
        else {
            return binary(arr,target,start,mid-1);

        }
    }
}
