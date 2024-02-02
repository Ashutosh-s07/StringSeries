import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {
    public static void countMatches(String[][] items, String ruleKey, String ruleValue) {
        int checkInd = 0, count_matches = 0;
        if( ruleKey == "type" ) checkInd=0; 
        else if( ruleKey == "color" ) checkInd=1; 
        else if( ruleKey == "name" ) checkInd=2;
        for( String[] s:items){
            if( s[checkInd]==ruleValue) count_matches++;
        }
        System.out.println(count_matches);
        
    }
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}}; 
        String ruleKey = "type", ruleValue = "phone";
        countMatches(items, ruleKey, ruleValue);
    }
}
