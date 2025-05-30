import java.util.Arrays;
public class Sortapproach {
    public static boolean isAnagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sarr= s.toCharArray();
        char[] tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
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

