public class Reverseanarray {
public static void main(String[] args) {
    int k=5;
    int[] arr ={5,2,3,1,4};
    int count=0;
    int [] newarr = new int[k];
    for(int i=k-1; i>=0; i--){
        newarr[count]=arr[i];
        count++;
    }
    System.out.println("Reversed array: "+java.util.Arrays.toString(newarr));


}
}
