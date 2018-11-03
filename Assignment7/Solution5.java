package assignment7;

import java.util.Arrays;

public class Solution5 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double[] res = new double[nums1.length + nums2.length];
		for(int i = 0; i < nums1.length; i++) {
			res[i] = nums1[i]; 
		}
		
		for(int i = 0; i < nums2.length; i++) {
			res[nums1.length + i] = nums2[i];
		}
		
		Arrays.sort(res);
		
		return (res[(res.length - 1) / 2] + res[res.length / 2]) /2;
	}
	
	 public static void main(String[] args) {
	        int[] a = {1, 2};
	        int[] b = {3, 4};
	        Solution5 s = new Solution5();
	        System.out.println(s.findMedianSortedArrays(a, b));
	    }
	
}
