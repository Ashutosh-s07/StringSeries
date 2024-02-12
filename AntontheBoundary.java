public class AntontheBoundary {
    public static int returnToBoundaryCount(int[] nums) {
        int result = 0;
        int sum = 0;
        for( int i:nums){
            sum += i;
            if(sum == 0) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-5};
        System.out.println(returnToBoundaryCount(nums));
    }
}
