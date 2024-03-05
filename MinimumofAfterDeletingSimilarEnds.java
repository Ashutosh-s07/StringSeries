public class MinimumofAfterDeletingSimilarEnds {
    public static int minimumLength(String s) {
        int result = 0;
        int l = 0, r = s.length()-1;
        if(s.charAt(l)!=s.charAt(r) || s.length()==1 ) return s.length();
        while (l<r) {
            while(l<r && s.charAt(l)==s.charAt(r) && s.charAt(l)==s.charAt(l+1)) l++;
            while(l<r && s.charAt(l)==s.charAt(r) && s.charAt(r)==s.charAt(r-1)) r--;
            if( s.charAt(l)!=s.charAt(r) ) break;
            System.out.println(l+" "+r);
            l++; r--;
            result = (r-l)-1;
        }
        return result<0?0:result;
    }
    public static void main(String[] args) {
        // String s = "aabccabba";
        // String s = "cabaabac";
        // String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbacccabbabccaccbacaaccacacccaccbbbacaabbccbbcbcbcacacccccccbcbbabccaacaabacbbaccccbabbcbccccaccacaccbcbbcbcccabaaaabbbbbbbbbbbbbbb";
        String s = "bbbbbbbbbbbbbbbbbbb";
        System.out.println(minimumLength(s));
    }
    
}
