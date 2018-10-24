import java.util.Calendar;

public class Cat extends Pet implements Boardable {
	private String hairLength;
	private Calendar startDate = Calendar.getInstance();
	private Calendar endDate = Calendar.getInstance();
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
		
	}
	
	public void check(int month, int day, int year) {
		if(month < 1 || month > 12) {
			throw new IllegalArgumentException("illegal month");
		}
		if(day < 1|| day > 31) {
			throw new IllegalArgumentException("illegal day");
		}
	}
	
	public void setBoardStart(int month, int day, int year) {
		check(month, day, year);
		this.startDate.set(month, day, year);
	}
	
	public void setBoardEnd(int month, int day, int year) {
		check(month, day, year);
		this.endDate.set(month, day, year);
	}
	
	public boolean boarding(int month, int day, int year) {
		check(month, day, year);
		Calendar date = Calendar.getInstance();
		date.set(month, day, year);
		
		return date.after(startDate) && !date.after(endDate);
		
	}
	
	public String getHairLength() {
		return hairLength;
	}
	
	public String toString() {
		return "CAT:\n" + super.toString() + "Hair: " + hairLength;
	}
	
}
