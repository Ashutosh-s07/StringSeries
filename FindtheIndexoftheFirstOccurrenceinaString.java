public class FindtheIndexoftheFirstOccurrenceinaString {
    public static int strStr(String haystack, String needle) {
        // int result = -1;
        // if(haystack.contains(needle)){
        //     result = haystack.indexOf(needle);
        // }
        // return result;

        return haystack.contains(needle)?haystack.indexOf(needle):-1;
    }
    public static void main(String[] args) {
        // String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}
