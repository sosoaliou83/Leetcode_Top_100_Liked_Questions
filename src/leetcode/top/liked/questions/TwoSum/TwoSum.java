package leetcode.top.liked.questions.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main (String[] args){
    int[] A = {1,5,9,3};
    twoSum(A,4);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] inds = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int index=0; index<nums.length; index++) {
            if(!map.containsKey(nums[index])) {
                map.put(target-nums[index],index);
            } else {
                inds[0] = index;
                inds[1] = map.get(nums[index]);
            }
        }
        return inds;
    }
}
