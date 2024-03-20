import java.util.Arrays;

public class LongestAbsoluteFilePath {
    public static  int lengthLongestPath(String input) {
        int result = 0;
        System.out.println(input);
        // String[] str = input.split("\n");
        // for( String s:str ) System.out.println(s.length());
        return result;
    }
    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println(lengthLongestPath(input));
    }
}
