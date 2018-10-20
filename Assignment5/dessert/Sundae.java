package dessert;

public class Sundae extends IceCream{
	
	private String toppingName;
	private double toppingCost;
	
	public Sundae(String name, double cost, String toppingName, double toppingCost) {
		super(name, cost);
		this.toppingName = toppingName;
		this.toppingCost = toppingCost;
		
	}
	
	public int getCost() {
		return (int)(toppingCost + cost);
	}
	
	public String toString(){
		return String.format("%-22s\n%-22s %2s %10.2f\n", super.name+" with ",toppingName,"",(super.getCost()+toppingCost)/100);
	}

}
