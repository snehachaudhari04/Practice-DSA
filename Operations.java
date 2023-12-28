// how many operation neede to make vevery element in the array same 

import java.util.HashMap;
import java.util.Map;

public class Operations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 3, 1};
        int n = 6;
         HashMap <Integer, Integer> map = new HashMap<>();
        
         for(int i=0;i<n;i++){
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         int maxfeq=0;
         for(Map.Entry<Integer,Integer> entry: map.entrySet() ){
               int feq= entry.getValue();
               if(feq>maxfeq){
                maxfeq = feq;
               }
         }
         System.out.println(n-maxfeq);



    }
}
