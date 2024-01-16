import java.util.*;
class MicrosoftOA{
    public static void main(String args[]){
        String s= "aaabbcccdcaabababacc";
        String t ="abcc";
        int ans =Integer.MAX_VALUE;
        HashMap <Character,Integer>map= new HashMap<>();
        HashMap<Character,Integer>map2 =new HashMap<>();
        for(int i=0;i<s.length();i++) {
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++) {
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
         }
         for(int i=0;i<t.length();i++){
              ans = Math.min(ans,map.get(t.charAt(i))/ map2.get(t.charAt(i)));
         }
         if(ans==Double.POSITIVE_INFINITY){
            System.out.println("0");
         }
         System.out.println(ans);
         
    }
    

}