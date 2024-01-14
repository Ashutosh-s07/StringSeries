public class RotateString { 
    
    /*Approach
    Idea is to use inbuilt function of strings
    1st line is clear if and only if length of both strings are equal then there is chance that given goal strings can be match in given string s after rotations, if length of both strings are not equal then we simply return false.
    Now understand 2 line by example,
    Example -> 
    s = A B C D
    goal = C D A B
    Now we concatenate s with itself and name it something else for better uderstanding means
    s1 = s + s
    s = A B C D A B C D
    Now we can use indexOf() method which returns starting index of string if its is present otherwise -1 or neagtive value , means if goal string is present in s1 string then it return value >=0, understand it like this*/


    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        return((s+s).indexOf(goal)>=0);
    }

    /* 
    public static boolean rotateString(String s, String goal) {
        if( s.length() != goal.length()) return false;
        int ind = -1;
        for( int i=0;i<goal.length();i++ ){
            if(checkRotate(s, i).equals(goal)) return true; 
        }
        return false;
    }
    public static String checkRotate( String s, int i){
        String str = "";
        char temp = s.charAt(0);
        for( int ind=0;ind<s.length();ind++ ){
            str += s.charAt(ind+1);
        }
        str += temp;
        return str;
        
    }
    */
    public static void main(String[] args) {
        String s = "abcde", goal = "abcde";
        System.out.println(rotateString(s,goal));
    }
}
