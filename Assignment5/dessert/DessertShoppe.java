package dessert;

public class DessertShoppe {
	
	public final static double TAX_RATE = 0.065;
	public final static String STORE_NAME = "M & M Dessert Shoppe";
	public final static int MAX_ITEM_NAME = 22;
	public final static int WIDTH_OF_COST = 10;

	public static String cents2dollarsAndCents(double cents) {
		String result = String.valueOf(cents / 100);
		return result;
	}
	
}
