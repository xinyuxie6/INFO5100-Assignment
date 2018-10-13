
public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    		//TODO
    	int count[] = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i) - 'a'] == 1)
				return i;
		}
		return -1;
	}
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
    		//TODO
    	int temp = 0;
		while (n > 9) {
			while(n > 9) {
				temp = temp + n%10;
				n = n/10;
			}
		n = n + temp;
		temp = 0;
		}
		return n;
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
    		//TODO
    	if(nums == null || nums.length ==0)
			return;
		int zeroNums = 0;
		for(int i = 0; i < nums.length; i++) {
			if ( nums[i] != 0) {
				int temp = nums[zeroNums];
				nums[zeroNums] = nums[i];
				nums[i] = temp;
				zeroNums++;
			}
		}
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s) {
		//TODO
		String longestSub = null;
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
        	for(int j = i + 1; j < s.length(); j++){
                if(isPalindrome(i, j, s) && (j - i + 1) > maxLen){
                	maxLen = j - i + 1;
                	longestSub = s.substring(i, j + 1);
                }
            }
        }
        return longestSub;
    }
	
	public boolean isPalindrome(int left,int right, String s){
		
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
    		//TODO
    	int n = matrix.length;
		
		//flip vertically
		for(int i = 0; i < n/2; i++) {
			for(int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 -i][j];
				matrix[n - 1 -i][j] = temp;
			}
		}
		
		//flip diagonally
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
   }
}
