import java.util.Arrays;

public class ApplyDiscounttoPrices {

    public static String discountPrices(String sentence, int discount) {
        String temp[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : temp) {
            if (isPrice(s)) sb.append(calc(Double.parseDouble(s.substring(1)), discount) + " "); 
            else sb.append(s + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static boolean isPrice(String s) {
        return s.startsWith("$") && s.substring(1).matches("\\d+");
    }

    public static String calc(double num, double discount) {
        double ans = num - (double) ((double) num * discount / 100.00);
        return "$" + String.format("%.2f", ans);
    }

    public static void main(String[] args) {
        String sentence = "$7383692 5q $5870426";
        int discount = 64;
        System.out.println(discountPrices(sentence,discount));
    }
}
