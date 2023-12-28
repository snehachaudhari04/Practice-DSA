import java.util.HashMap;
import java.util.HashSet;

public class Twosum {
    public static void main(String[] args) {
        int arr[] = {1, -2, -1, 1, 3};
        int x = 4;
        HashSet<Integer> map= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int rem = x-arr[i];
            if(map.contains(rem)){
                System.out.println("2sum hai");
            }
            else{
                map.add(arr[i]);
            }


        }
        //System.out.println("2sum  nhi hai");

    }
}
