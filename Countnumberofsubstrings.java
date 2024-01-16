import java.util.*;

public class Countnumberofsubstrings {
    public static long substrCount(String S, int goal) {
        char[] str = S.toCharArray();
        // return atMost(str, goal-1);
        return atMost(str, goal)-atMost(str, goal-1);
    }
    public static int atMost(char[] nums, int goal)
    {
        HashMap<Character,Integer> hmp = new HashMap<>();
        int count = 0, ans = 0, start = 0, end = 0;
        int n = nums.length;
        while(end<n){
            hmp.put(nums[end],hmp.getOrDefault(nums[end],0)+1);
            if(hmp.size() == goal) count++;
            while(hmp.size()>goal){
                char leftInt = nums[start]; 
                if (hmp.get(leftInt) == 1)   hmp.remove(leftInt);
        		else  hmp.put(leftInt, hmp.get(leftInt) - 1);
                start++;
            }
            ans += end-start+1;
            end++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String S = "aba";
        int K = 2;
        System.out.println(substrCount(S, K));
    }
}
