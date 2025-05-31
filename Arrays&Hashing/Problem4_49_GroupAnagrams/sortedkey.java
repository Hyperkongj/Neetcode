package Problem4_49_GroupAnagrams;
import java.util.*;

public class sortedkey {
    public List<List<String>> Grouper(String[] strs){
        HashMap <String,List<String>> map =new HashMap<>();
        for( String s : strs){
            char[] chars= s.toCharArray();
            Arrays.sort(chars);
            String key= new String(chars);
            if ((!map.containsKey(key))) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());



    }
    public static void main(String[] args) {
        sortedkey solution = new sortedkey();

        // Sample test input
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = solution.Grouper(input);

        // Print the grouped anagrams
        System.out.println("Grouped Anagrams:");
        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
}
   
    

