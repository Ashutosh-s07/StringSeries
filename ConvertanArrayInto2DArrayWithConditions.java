import java.util.*;

public class ConvertanArrayInto2DArrayWithConditions {
    public static List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        while(!hm.isEmpty()){
            List<Integer> key2remove=new ArrayList<>();
            List<Integer> ansrr=new ArrayList<>();
            for(int it:hm.keySet()){
                ansrr.add(it);
                hm.put(it,hm.get(it)-1);
                if(hm.get(it)==0){
                    key2remove.add(it);
                }
            }
            for(int it:key2remove){
                hm.remove(it);
            }
            ans.add(ansrr);
        }
        return ans;

        // using Iterator to avoid ConcurrentModificationException
        
        /* 
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                temp.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);
                if (entry.getValue() == 0) {
                    iterator.remove();
                }
            }

            ans.add(temp);
        }

        return ans;
        */
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        findMatrix(nums);
    }
}
