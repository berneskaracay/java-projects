public class ReverseWords{

 public static String reverseWords(String str){
     String[] str2 = str.split(" ");
     String fin = "";
     for(int i=str2.length-1;i>=0;i--){
       fin += str2[i];
       if(i>0)fin+=" ";
     }
     return fin;
 }
}