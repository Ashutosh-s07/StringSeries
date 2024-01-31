import java.nio.channels.FileChannel.MapMode;
import java.util.Arrays;

public class MaximumNumberofWordsFoundinSentences {
    
    public static int mostWordsFound(String[] sentences) {
        
        int max_length = 0;
        for( String s : sentences ){
            String[] sub = s.split(" ");
            max_length = Math.max(max_length,sub.length);
        } 
        return max_length;
    }
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }
}
