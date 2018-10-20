package extraCredit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        if (matrix.length == 0) 
            return res;

        int mBegin = 0;
        int mEnd = matrix.length - 1;
        int nBegin = 0;
        int nEnd = matrix[0].length - 1;

        while( mBegin <= mEnd && nBegin <= nEnd) {
        	
        	//rightwards
        	for(int i = nBegin; i <= nEnd; i++)
                res.add(matrix[mBegin][i]);
            mBegin++;
            
            //downwards
            for(int i = mBegin; i <= mEnd; i++)
            	res.add(matrix[i][nEnd]);
            nEnd--;
            
            //leftwards
            if(mBegin <= mEnd) {
            	for(int i = nEnd; i >= nBegin; i--)
            		res.add(matrix[mEnd][i]);
            }
            mEnd--;
            
            //upwards
            if(nBegin <= nEnd) {
            	for(int i = mEnd; i >= mBegin; i--)
                    res.add(matrix[i][nBegin]);
            }
            nBegin++;
        }

        return res;
    }
	

    public static void main(String args[]){
    	
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.print(spiralOrder(matrix));    
        
    }  
}
