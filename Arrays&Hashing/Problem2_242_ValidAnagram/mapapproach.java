import java.util.HashMap;
public class mapapproach {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char strg : s.toCharArray()) {
            map.put(strg, map.getOrDefault(strg, 0) + 1);
        }
        for (char strg : t.toCharArray()) {
            if(!map.containsKey(strg)) return false;
            map.put(strg, map.get(strg)-1);
            if(map.get(strg)==0) map.remove(strg);
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String t1 = "silent";

        String s2 = "hello";
        String t2 = "world";

        System.out.println("Are \"" + s1 + "\" and \"" + t1 + "\" anagrams? " + isAnagram(s1, t1));
        System.out.println("Are \"" + s2 + "\" and \"" + t2 + "\" anagrams? " + isAnagram(s2, t2));
    }
}
