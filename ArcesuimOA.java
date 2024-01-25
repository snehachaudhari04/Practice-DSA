import java.util.HashMap;

public class ArcesuimOA {
    public static void main(String agrs[]){
        String A= "abcd";
        String B ="abcd";
        HashMap <Character,Integer>Aeven=new HashMap<>();
        HashMap <Character,Integer>Aodd=new HashMap<>();
        HashMap <Character,Integer>Beven=new HashMap<>();
        HashMap <Character,Integer>Bodd=new HashMap<>();
    
    for(int i=0;i<A.length();i++){
       if(i%2==0){
        Aeven.put(A.charAt(i),Aeven.getOrDefault(A.charAt(i),0)+1);
       }
       else{
        Aodd.put(A.charAt(i),Aodd.getOrDefault(A.charAt(i),0)+1);
       }
    }
    for(int i=0;i<B.length();i++){
        if(i%2==0){
         Beven.put(B.charAt(i),Beven.getOrDefault(A.charAt(i),0)+1);
        }
        else{
         Bodd.put(B.charAt(i),Bodd.getOrDefault(A.charAt(i),0)+1);
        }
     }
     if(Aeven==Beven&&Aodd==Bodd){
        System.out.println("Yes");
     }
     else{
        System.out.println("No");
        
     }
}
}
