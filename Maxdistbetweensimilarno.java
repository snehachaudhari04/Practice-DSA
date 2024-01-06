import java.util.*;
class Maxdistbetweensimilarno{
    public static void main(String args[]){
        int arr[]={1,3,5,1,2,6,8,1,2,4,3};
        int max = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
            else{
                  int oldindex= map.get(arr[i]);
                  int dist= i-oldindex;
                  max=Math.max(dist,max);
            }
        }
        System.out.println(max);
    }
}
//TimeComplexity =O(n)