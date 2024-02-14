public class SumUptoX {
    public static void main(String args[]){
        int n=6;
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={100,300,400,450,600,700};
        int x= 677;
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(arr1[i]+arr2[j]>x){
                j--;
            }
            else{
                ans=Math.max(ans,arr1[i]+arr2[j]);
                i++;
            }
        }
        System.out.println(ans);
    }
}
