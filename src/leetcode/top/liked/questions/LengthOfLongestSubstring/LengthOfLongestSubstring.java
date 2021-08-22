package leetcode.top.liked.questions.LengthOfLongestSubstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        lengthOfLongestSubstring("dvdf");
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet();
        while(j<s.toCharArray().length) {
            if(!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(),max);
            } else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(max);
        return max;
    }
}
