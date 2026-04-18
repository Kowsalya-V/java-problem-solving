package Hashset;
import java.util.*;
public class IntersectionofArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int nums:nums2){
            if(set.contains(nums)){
                intersect.add(nums);
            }
        }
        int res[] = new int[intersect.size()];
        int i = 0;
        for(int val:intersect){
            res[i++] = val;
        }
        return res;
    }
}

