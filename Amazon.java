/*Given an array A consisting of N integers, returns the maximum sum of two numbers whose digits add up to an equal sum.
if there are not two numbers whose digits have an equal sum, the function should return -1.
Constraints: N is integer within the range [1, 200000]
each element of array A is an integer within the range [1, 1000000000]
Example1:
Input:
A = [51, 71, 17, 42]
Output: 93
Explanation: There are two pairs of numbers whose digits add up to an equal sum: (51, 42) and (17, 71), The first pair sums up to 93 */

 import java.util.HashMap;

class Amazon{
    public static void main(String args[]){
       int arr[]={51,71,17,42};
       int maxi=-1;
       HashMap<Integer,Integer>map= new HashMap<>();
       for(int i=0;i<arr.length;i++){
         if(map.containsKey(digisum(arr[i]))){
            int sami = arr[i]+map.get(digisum(arr[i]));
            maxi=Math.max(maxi,sami);
            map.put(digisum(arr[i]),Math.max(map.get(digisum(arr[i])),arr[i]));
            
         }
         else{
            map.put(digisum(arr[i]),arr[i]);
         }
       }
       System.out.println(maxi);
        
    }
    public static int digisum(int a){
        int sum=0;
        while(a!=0){
           sum=sum+a%10;
           a=a/10;
        }
        return sum;
    }
}
