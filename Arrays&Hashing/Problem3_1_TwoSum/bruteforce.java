package Problem3_1_TwoSum;
import java.util.Arrays;
public class bruteforce{
    public static int[] bruteforce(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
    
            }      
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String[] args){
        int nums[]={2,7,9,11};
        int target= 9;
        System.out.print(Arrays.toString(bruteforce(nums, target)));
    }

}

