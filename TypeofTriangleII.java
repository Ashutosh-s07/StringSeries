public class TypeofTriangleII {
    public String triangleType(int[] nums){
        if( nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0] ){
            if( nums[0]==nums[1] && nums[1]==nums[2]) return "equilateral";
            else if( nums[0] != nums[1] && nums[1] !=nums[2] && nums[0] !=nums[2] ) return "scalene";
            else return "isosceles";
        }
        else return "none";
        
    }
    public static void main(String[] args) {
        int[] nums = {3,3,3};
    }
}
