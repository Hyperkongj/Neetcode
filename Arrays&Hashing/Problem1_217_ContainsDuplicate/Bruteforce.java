class Bruteforce{
    public boolean containsduplicate(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Bruteforce bf = new Bruteforce();
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println(bf.containsduplicate(nums)); // Output: true
    }
}