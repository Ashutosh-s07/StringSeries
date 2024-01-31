public class FinalofVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for( String s:operations ){
            if( s.equals("++X") || s.equals("X++") ) count +=1;
            else count -=1;
        } 
        return count;
    }
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }
}