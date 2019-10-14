package leet_code.easy;

public class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int newArrayCurrentIndex = nums1.length - 1;
        while (n >= 0) nums1[newArrayCurrentIndex--] = (m >= 0 && nums1[m] >= nums2[n]) ? nums1[m--] : nums2[n--];
    }
}
