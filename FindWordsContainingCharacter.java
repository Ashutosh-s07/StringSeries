import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> al = new ArrayList<>();
        String s = String.valueOf(x);
        int i=0;
        for( String str : words ){
            if(str.contains(s)) al.add(i);
            i++;
        }
        return al;
    }

    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words,x));

    }
}
