public class LargestOddNumberinString {
    
    public static String largestOddNumber(String num) {
        int  n = num.length();
        int oddInd = -1;
        String str = "";
        for( int i=n-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                oddInd = Math.max(i, oddInd);
                // System.out.println(num.charAt(i));
            } 
        }
        // System.out.println("oddInd :"+oddInd);
        // System.out.println(num.substring(0, oddInd+1));
        return num.substring(0, oddInd+1);
    }
    public static void main(String[] args) {
        String num = "35427";
        largestOddNumber(num);
    }
}
