import java.util.*;

import javax.swing.ComponentInputMap;

public class DecodetheMessage {
    public static String decodeMessage(String key, String message) {

        char start = 'a';
        char[] mapping = new char[1000];
        Arrays.fill(mapping,'0');

        for( int i=0;i<key.length();i++ ){
            if( key.charAt(i) != ' ' && mapping[key.charAt(i)]=='0'){
                mapping[key.charAt(i)] = start;
                start++;
            }
        }

        String ans = "";
        for( int i=0;i<message.length();i++){
            char c = message.charAt(i);
            if( c == ' ') ans += c;
            else {
                char decoded_char = mapping[c];
                ans += decoded_char;
            }
        }
        return ans;




        // Map<Character,Character> hmp = new HashMap<>();
        // String result = "";
        // char c = 'a';
        // for( int i=0;i<key.length();i++){
        //     char ch = key.charAt(i);
        //     if( ch == ' ') continue;
        //     else if( ch != ' ' && hmp.containsKey(ch)) {
        //         continue;
        //     }
        //     else if( ch != ' ' && !hmp.containsKey(ch)) {
        //         hmp.put(ch,c);
        //     }
        //     System.out.println(ch+" -> "+c++);
        // }
        // System.out.println(hmp);
        // System.out.println(hmp);
        // return result;
    }
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }
}
