public class RomantoInteger {
    
    public static int romanToInt(String s) {
        int result = 0;
        // int ans = 0; int num = 0;
        for( int i=0;i<s.length();i++ ) {
            if(s.charAt(i)=='I') result += 1;
            if(s.charAt(i)=='V') result += 5;
            if(s.charAt(i)=='X') result += 10;
            if(s.charAt(i)=='L') result += 50;
            if(s.charAt(i)=='C') result += 100;
            if(s.charAt(i)=='D') result += 500;
            if(s.charAt(i)=='M') result += 1000;
        }
        if(s.contains("IV") || s.contains("IX")) result -= 2;
        if(s.contains("XC") || s.contains("XL")) result -= 20;
        if(s.contains("CD") || s.contains("CM")) result -= 200;

        // if (4 * num < ans) ans -= num;
        // else ans += num;
        return result;
    }
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
