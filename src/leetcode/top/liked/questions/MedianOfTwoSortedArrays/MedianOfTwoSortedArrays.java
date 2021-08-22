package leetcode.top.liked.questions.MedianOfTwoSortedArrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,15,7},new int[]{2,1,3});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list1.addAll(list2);
        Collections.sort(list1);
        if(list1.size()%2==0) return (list1.get(list1.size()/2-1)+list1.get(list1.size()/2))/2;
        else return list1.get(list1.size()/2);
    }
}
