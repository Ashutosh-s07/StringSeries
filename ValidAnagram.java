import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);


        /* 

        if( s.length() != t.length() ) return false;
        HashMap<Character,Integer> maps = new HashMap<>();
        HashMap<Character,Integer> mapt = new HashMap<>();
        for( int i=0;i<s.length();i++ ){
            if( !maps.containsKey(s.charAt(i))) maps.put(s.charAt(i),0);
            if( maps.containsKey(s.charAt(i))) maps.put(s.charAt(i),maps.get(s.charAt(i))+1);
            if( !mapt.containsKey(t.charAt(i))) mapt.put(t.charAt(i),0);
            if( mapt.containsKey(t.charAt(i))) mapt.put(t.charAt(i),mapt.get(t.charAt(i))+1);
        }
        System.out.println(maps);
        System.out.println(mapt);
        if(maps.equals(mapt)) return true;
        return false;*/
    }
    public static void main(String[] args) {
        String s = "aacc", t = "ccac";
        System.out.println(isAnagram(s,t));
    }
}
