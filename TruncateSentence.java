import java.util.Arrays;

public class TruncateSentence{
    public static String truncateSentence(String s, int k) {
        StringBuffer str = new StringBuffer();
        String[] st = s.split(" ");
        for( int i=0;i<k;i++ ) str.append(st[i]+" ");
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));

    }
}