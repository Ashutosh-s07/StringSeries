public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        
        if ("0".equals(num1) || "0".equals(num2))return "0";

        int n = num1.length()-1;
        int m = num2.length()-1;
        int[] temp = new int[n+m+2];

        for( int i=n;i>=0;i--){
            for( int j=m;j>=0;j--){
                temp[i+j+1] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                temp[i+j] += temp[i+j+1]/10;
                temp[i+j+1] %= 10;
            }
        }

        int i = 0;
        while( i < temp.length && temp[i]==0 ) i++;

        String ans = "";
        while ( i<temp.length ) ans += temp[i++];

        return ans;
    }
    public static void main(String[] args) {
        String  num1 = "0", num2 = "3";
        System.out.println(multiply(num1,num2));   
    }
}
