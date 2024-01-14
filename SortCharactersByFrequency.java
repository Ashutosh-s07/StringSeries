import java.util.*;
class Pair{
    Character c;
    int freq;
    public Pair( Character c, int freq ){
        this.c = c;
        this.freq = freq;
    }
}
public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        String str="";
        HashMap<Character,Integer> map = new HashMap<>();
        Pair[] arr = new Pair[map.size()];
        for( int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),1);
            else if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        System.out.println(map);
        for( int i=0;i<map.size();i++) System.out.print(map.get(s.charAt(i)));

        return str;
    }
    public static void main(String[] args) {
        String s = "ashutoshsahu";
        System.out.println(frequencySort(s));
    }
}
