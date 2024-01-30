import java.util.HashMap;

public class UberOA {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        //BruteForce Approch 
       /*  int sum=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                 String s1= String.valueOf(arr[i]);
                 String s2= String.valueOf(arr[j]);
                 String concate = s1+s2;
                 sum+= Integer.parseInt(concate);
            }
        }  */

        // Optimal Strt here 
        int tosum=0;
        for(int i=0;i<arr.length;i++){
           tosum+=arr[i];
        }
        int sum=0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int  u= count(arr[i]);
            map.put(u,map.getOrDefault(u, 0)+1);
        }
        System.out.println(map);
        int total=0;
        for(int i=0;i<arr.length;i++){
            int k=1;
            while(k<=6){
                if(map.containsKey(k)){
                sum+=Math.pow(10,k)*map.get(k);
                }
                k++;
            }
           total=sum+total; 
        }
        System.out.println(total+tosum);
    
    }
    public static int count(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    
}
