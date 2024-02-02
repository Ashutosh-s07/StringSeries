public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int result = 0;
        for( int i=0;i<s.length();i++){
            for( int j=i;j<s.length();j++){
                if(isPalindrome(s, i, j)) result++;
            }
        }
        return result;
    }
    public static boolean isPalindrome(String s, int i,int j){
        while (i<j) {
            if( s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    } 
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}
