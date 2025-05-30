import java.util.HashMap;

public class hashmap {
    public boolean constainsduplicate(int nums[]){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
    public static void main(String[] args) {
        Bruteforce bf = new Bruteforce();
        int[] nums = { 1,2, 3, 4, 5, 1};
        System.out.println(bf.containsduplicate(nums)); // Output: true
    }
}
