import java.util.Arrays;
class Sorting{
    public boolean containsduplicates(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Bruteforce bf = new Bruteforce();
        int[] nums = { 2, 3, 4, 5, 1};
        System.out.println(bf.containsduplicate(nums)); // Output: true
    }
}