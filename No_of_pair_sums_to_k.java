// fInd no of pairs that sums to k 

import java.util.HashMap;

public class No_of_pair_sums_to_k {
    public static void main(String[] args) {
        int arr[]={10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int k=11;
        int sum=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=k-arr[i];
            if(map.containsKey(temp)){
               sum+=map.get(temp);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            
        }
        System.out.println(sum);
    }
}
