import java.util.*;

public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings;
	
	public Mreview() {
		this.title = "";
		this.ratings = new ArrayList<>();
	}
	
	public Mreview(String ttl) {
		this.title = ttl;
		this.ratings = new ArrayList<>();
		
	}
	
	public Mreview(String ttl, int firstRating) {
		this.title = ttl;
		this.ratings = new ArrayList<>();
		this.ratings.add(firstRating);
	}
	
	
	public String getTitle() {
		return title;
		
	}
	
	public void addRating(int r) {
		this.ratings.add(r);
	}
	
	public double aveRating() {
		double sum = 0;
		
		for(int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i);
		}
		return sum / ratings.size();
	}

	
	public int numRatings() {
		return ratings.size();
	}
	
	public int CompareTo(Mreview obj) {
		return this.title.compareTo(obj.title);
	}
	
	public boolean equals(Object obj) {
		if(this.title.equals(((Mreview) obj).title)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String toString() {
		return title + ", average " + aveRating() + "out of " + numRatings();
	}
	
	public static void main(String[] args) {
		Mreview mreview = new Mreview("Kill Bill", 3);
		mreview.addRating(4);
		mreview.addRating(3);
		System.out.println(mreview);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
