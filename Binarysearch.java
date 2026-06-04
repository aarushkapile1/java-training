public class Binarysearch {
public static void main(String[] args) {
    int[]arr={1,3,5,7,9,11,13};
    int target =5;
    int left=0;
    int right=arr.length-1;
    int mid=(left+right)/2;
    while(left<=right){
        if(arr[mid]==target){
            System.out.println("Element found at index: "+mid);
            return;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
        mid=(left+right)/2;
    }
    System.out.println("Element not found in the array.");

    
}
}
