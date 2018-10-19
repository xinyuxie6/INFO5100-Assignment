package dessert;

public class Candy extends DessertItem {
	private double weight;
	private double pricePerPound;
	
	public Candy(String name, double weight, double pricePerPound) {
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
		
	}
	
	public int getCost() {
		return (int)Math.round(weight * pricePerPound);
		
	}
	
	public String toString() {
		
		return weight + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(pricePerPound) + " /lb.\n"
				+String.format("%-22s %2s %10.2f\n", name, " ", weight * pricePerPound /100);			
	}
	

}
