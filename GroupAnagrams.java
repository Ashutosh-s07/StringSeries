import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void groupAnagrams2(String[] strs) {
        
        List<List<String>> resuList = new ArrayList<>();
        
        List<String> temp = new ArrayList<>();
        for( int i=0;i<strs.length;i++ ) temp.add(sortString(strs[i])); 

        for( int i=0;i<temp.size();i++){
            List<String> subList = new ArrayList<>();
            String s = temp.get(i);
            for( int j=i;j<temp.size();j++){
                if( s.equals(temp.get(j)) && !temp.get(j).equals("#")){
                    subList.add(strs[j]);
                    temp.set(j, "#");
                }
            }
            if( !subList.isEmpty()) resuList.add(subList);
            
        }
        System.out.println(resuList);
    }
    public static String sortString(String str) {
        char[] st = str.toCharArray();
        java.util.Arrays.sort(st);
        String sortedString = new String(st);
        return sortedString;
    }

    public static void main(String[] args) {
        // String[] strs = {"eat","tea","tan","ate","nat","bat"};  
        String[] strs = {"a"};  
        groupAnagrams(strs);
    }
}
