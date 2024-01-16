public class NestingDepthoftheParentheses {
    public int maxDepth(String s) {

            int left = 0;
            int depth = 0;
            for( int i=0;i<s.length();i++ ){
                if( s.charAt(i)=='(') {
                    left++;
                    depth = left>depth?depth:left;
                    
                }
                if( s.charAt(i)==')') left--; 

            }
            return depth;
            
    }
}
