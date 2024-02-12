public class RemoveAllOccurrencesofaSubstring {
    public static String removeOccurrences(String s, String part) {
        String str = s;
        while( str.contains(part) ){
            str = str.replaceFirst(part,"");
        }
        return str;
    }
    public static void main(String[] args) {
        
        String s = "axxxxyyyyb", part = "xy";
        System.out.println(removeOccurrences(s,part));
    }
}
