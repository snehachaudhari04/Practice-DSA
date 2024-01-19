import java.util.*;
class VisaOA{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();//size of array 
        int q=sc.nextInt();//no of quries ;
        int arr[]=new int[n];
        // real logic starts here
        for(int i=0;i<q;i++){
            int l=sc.nextInt();
            int r= sc.nextInt();
            arr[l]=arr[l]+1;
            if(r<n-1){
            arr[r+1]=arr[r+1]-1;
            }
        }
        int sum=0;  // loop for prefix sum
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        for(int i=0;i<n;i++){   // print array after updating
            System.out.print(arr[i]);
        }


    }
}