import java.util.*;

class Pair{
    Character ch;
    int freq;
    public Pair( Character ch, int freq ){
        this.ch = ch;
        this.freq = freq;
    }
}
public class SortCharactersByFrequency {
    public static String frequencySort1(String s) {
        // Count the occurence on each character
        HashMap<Character, Integer> cnt = new HashMap<>();
	    for (char c : s.toCharArray()) {
		    cnt.put(c, cnt.getOrDefault(c, 0) + 1);
	    }
	
     	// Sorting
	    List<Character> chars = new ArrayList(cnt.keySet());
	    Collections.sort(chars, (a, b) -> (cnt.get(b) - cnt.get(a)));

	    // Build string 
	    StringBuilder sb = new StringBuilder();
	    for (Object c : chars) {
		    for (int i = 0; i < cnt.get(c); i++) {
			    sb.append(c);
		    }
	    }
        System.out.println(chars);
	    return sb.toString();
    }

    public static String frequencySort2(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }

        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)-> a.freq==b.freq ? a.ch - b.ch : b.freq- a.freq);
        for(Character i: map.keySet()){
            pq.add(new Pair(i, map.get(i)));
        }

        String ans="";

        while(!pq.isEmpty()){
            char ch= pq.peek().ch;
            int fr= pq.peek().freq;
            pq.poll();

            while(fr!=0){
                ans+=ch;
                fr--;
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "ashu123toshsahu";
        System.out.println(frequencySort1(s));
    }
}
