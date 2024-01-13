import java.util.*;

public class ReverseWordsinaString{
    public static String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");  
        //To split a string by space, use \\s+ . It will split the string by single or multiple whitespace characters such as space, tab, etc.
        String out = "";
        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }
        return out + str[0];


        /*String[] splitArr = s.split(" ");
        int n = splitArr.length;
        StringBuffer sb = new StringBuffer();
        for( int i=n-1;i>=0;i--){
            if( splitArr[i] != "") sb.append(splitArr[i]+" ");
        }   
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.length());
        String result = sb.toString();
        System.out.println(result);
        return result;*/
    
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        String v = reverseWords(s);
    }
}