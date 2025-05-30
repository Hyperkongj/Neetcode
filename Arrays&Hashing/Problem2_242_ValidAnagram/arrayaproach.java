import java.util.Arrays;
public class arrayaproach {
    public static boolean isAnagram(String s, String t){
        int arr[]=new int [26];
        for(int i=0;i<s.length();i++ ){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int a : arr){
            if(a!=0) {return false;}
        }
        return true;

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
