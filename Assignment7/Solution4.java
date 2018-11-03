package assignment7;

import java.util.*;

class Interval {
	int start;
	int end;
	
	public Interval(int start, int end) {
		this.start = start; 
		this.end = end;
	}
}


public class Solution4 {
	public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<Interval>();
        
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        
        if(intervals == null || intervals.size() == 0)
            return list;
        Interval prev = intervals.get(0);
        Interval temp;
        int i = 1;
        while(i < intervals.size()){
            temp = intervals.get(i);
            if(prev.end >= temp.start){
                prev.end = Math.max(prev.end,temp.end);
            }
            else{
                list.add(prev);
                prev = temp;
            }
            i++;
        }
        list.add(prev);
        return list;
    }


 
    public static void main(String[] args) {
    	Interval p1 = new Interval(1,3);
		Interval p2 = new Interval(2,4);
		Interval p3 = new Interval(5,7);
		Interval p4 = new Interval(6,8);
		List<Interval> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		System.out.println(merge(list));
	}
    
    
    
    
    
}
