package Problem3_1_TwoSum;
import java.util.Arrays;
import java.util.HashMap;

public class hashmapapproach{
    public static int[] checker(int[] nums, int target){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])) {
                return new int[]{i, map.get(target-nums[i])};
            }
        map.put(nums[i],i);
    
    }
    throw new IllegalArgumentException("No solution found");
}
public static void main(String[] args){
    int nums[]={2,7,9,11};
        int target= 11;
        System.out.print(Arrays.toString(checker(nums, target)));
}
        
}



