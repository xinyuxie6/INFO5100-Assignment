package dessert;

import java.util.ArrayList;

public class Checkout {
	private ArrayList<DessertItem> list;
	
	public Checkout() {
		list = new ArrayList<DessertItem>();
	}
	
	public int numberOfItems() {
		return list.size();
	}
	
	public void enterItem(DessertItem item) {
		list.add(item);
	}
	
	public void clear() {
			list.clear();
	}
	
	public int totalCost() {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getCost();
		}
		return sum;
	}
	
	public int totalTax() {
		return (int)Math.round(totalCost() * DessertShoppe.TAX_RATE);
	}
	
	public String toString() {
		String str = "";
		str += "         " + DessertShoppe.STORE_NAME + "\n";
		str += "         " + "--------------------\n\n";
		
		for(int i= 0; i < list.size(); i++) {
			str += list.get(i).toString();
		}
		str += "\n";
		str += String.format("%-22s %13s\n", "Tax","."+String.valueOf(totalTax()));
		str += String.format("%-22s %13.2f","Total Cost",(totalCost()+totalTax())/100.0) + "\n";
		return str;	
	}
		
}