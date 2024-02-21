import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public static void groupAnagrams(String[] strs) {
        
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
