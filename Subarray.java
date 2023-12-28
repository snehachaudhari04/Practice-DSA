import java.util.*;
class Subarray{
    public static void main(String args[]){
        int[] arr1 = {6, 7, 3, 2};
        int[] arr2 = {2, 10};
        int n1 = arr1.length, n2 = arr2.length;
        HashSet<Integer> temp= new HashSet<>();
        for(int i=0;i<n1;i++){
            temp.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            if(!temp.contains(arr2[i])){
                System.out.println("Not SubSet");
            }
        }
    }
}