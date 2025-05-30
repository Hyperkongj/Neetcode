import java.util.HashSet;
public class usingset {
    public boolean containsduplicate(int nums[]){
        HashSet<Integer> set =new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Bruteforce bf = new Bruteforce();
        int[] nums = {1, 2, 3, 4, 5, 1};
        System.out.println(bf.containsduplicate(nums)); // Output: true
    }
}
