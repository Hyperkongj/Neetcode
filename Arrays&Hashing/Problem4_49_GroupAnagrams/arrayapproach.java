package Problem4_49_GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class arrayapproach {
    public List<List<String>> grouper(String[] strs){
        HashMap<String, List<String>> map =new HashMap<>();

        for(String str:strs){
            int[] moe=new int[26];

            for(char c: str.toCharArray()){
                moe[c-'a']++;
            }
        
        StringBuilder sb =new StringBuilder();
        for(int num : moe){
            sb.append(num).append("#");
        }
        String key =sb.toString();
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(str);
        
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
