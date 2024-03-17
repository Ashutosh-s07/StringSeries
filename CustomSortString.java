import java.util.Arrays;
import java.util.HashMap;

public class CustomSortString {
    public static String customSortString(String order, String s) {
        
        String result = "";
        String resultSec = "";
        for( int i=0;i<s.length();i++){
            String str = String.valueOf(s.charAt(i));
            if(order.contains(str)) result += s.charAt(i);
            else resultSec += s.charAt(i);    
        }
        return result+resultSec;
        
    }
    public static boolean finchar( String order, char c){
        String str = String.valueOf(c);
        return order.contains(str);
    }
    public static void main(String[] args) {
        // String order = "bcafg", s = "abcd";
        String order = "cba", s = "abcd";
        // String order = "kqep", s = "pekeq";
        System.out.println(customSortString(order, s));
    }
}
