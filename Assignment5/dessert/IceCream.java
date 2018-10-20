package dessert;

public class IceCream extends DessertItem{
	
	protected double cost;
	
	public IceCream(String name, double cost) {
		super(name);
		this.cost = cost;
	}
	
	public int getCost() {
		return (int)cost;
	}
	
	public String toString(){
		 return String.format("%-22s %2s %10.2f\n", name,"", cost/100);
	}
	
}
