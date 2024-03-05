public class MaximumOddBinaryNumber {
    
    public static String maximumOddBinaryNumber(String s) {

        int count_1 = 0;
        StringBuilder sb = new StringBuilder();
        
        for( int i=0;i<s.length();i++)
            if(s.charAt(i)=='1') count_1++;
        

        for( int i=0;i<s.length()-1;i++){
            if(i<count_1-1) sb.append("1");
            else sb.append("0");
        sb.append("1");

        return sb.toString();
        
    }
    public static void main(String[] args) {
        String s = "010";
        System.out.println(maximumOddBinaryNumber(s));
    }
}
