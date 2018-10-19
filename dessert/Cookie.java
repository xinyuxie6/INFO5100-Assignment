package dessert;

public class Cookie extends DessertItem {
	
	private int number;
	private double pricePerDozen;
	
	public Cookie(String name, int number, double pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	public int getCost() {
		return (int)Math.round(number * pricePerDozen / 12.0);
	}

	
	public String toString() {
		return number + " @ " + DessertShoppe.cents2dollarsAndCents(pricePerDozen) + " /dz.\n"
				+String.format("%-22s %2s %10.2f\n", name, "", number * pricePerDozen / 12 / 100);
	}
	
}
