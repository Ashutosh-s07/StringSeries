public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String ans = "";
        for( int i=0;i<s.length();i++ ){
            for( int j=i;j<s.length();j++ ){
                if(s.charAt(i) == s.charAt(j)){
                    if(isPalindrome(s,i,j)){
                        String t = s.substring(i,j+1);
                        ans = t.length()>ans.length() ? t : ans;
                    } 
                }
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String s, int i, int j) {
        while (i<j) {
            if( s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "cbbd";
        // System.out.println(s.substring(0,3));
        System.out.println(longestPalindrome(s));
        
    }
}
