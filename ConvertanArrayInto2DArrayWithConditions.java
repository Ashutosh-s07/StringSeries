import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertanArrayInto2DArrayWithConditions {
    public static void findMatrix(int[] nums) {
        
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        HashMap<Integer,Integer> hmp = new HashMap<>();
        for( int i=0;i<nums.length;i++ ){
            hmp.put(nums[i],hmp.getOrDefault(nums[i],0)+1);
        }
        int maxi = 0;
        for( int i=0;i<hmp.size();i++) maxi = Math.max(maxi,hmp.get(i));
        System.out.println(maxi);
        // for( int i=0;i<maxi;i++){
        //     List<Integer> subL = new ArrayList<Integer>();
        //     for( int j=0;j<hmp.size();j++){
        //         if(hmp.get(i)>0){
                      
        //             hmp.put(nums[i], hmp.get(nums[i])-1);
        //         }
        //     }
        //     al.add(subL);
        // }
        for( List<Integer> l : al) System.out.println(l);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        findMatrix(nums);
    }
}
