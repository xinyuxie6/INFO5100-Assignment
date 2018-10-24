
public class Test {
	
	public static void main(String[] args) {
		Pet p = new Pet("Spot", "Mary", "Black and White");
		p.setSex(0);
		
		System.out.println(p.toString());
		
		
		Cat c = new Cat("Tom", "Bob", "Black", "short") ;
		c.setSex(2);
		c.setBoardStart(4, 21, 2018);
		c.setBoardEnd(8, 29, 2018);
		boolean x = c.boarding(4, 21, 2018);
		
		System.out.println(c);
		System.out.println(x);
		
		
		Dog d = new Dog("Spot", "Susan", "white", "medium");
		d.setSex(2);
		d.setBoardStart(4, 21, 2018);
		d.setBoardEnd(8, 29, 2018);
		boolean y = d.boarding(8, 29, 2018);
		
		System.out.println(d);
		System.out.println(y);
	}
	
}
