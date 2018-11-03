package assignment7;


class Tool{
	protected int strength;
	protected char type;
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
}

class Rock extends Tool{
	Rock(int Strength) {
		setStrength(Strength);
		this.type = 'r';
		
	}
	
	public boolean fight(Tool tool) {
		if(tool.type == 's') {
			return 2 * getStrength() > tool.getStrength();
		}
		else {
			return getStrength() > 2 * getStrength();
		}
	}
	
	
}

class Paper extends Tool{
	Paper(int Strength) {
		setStrength(Strength);
		this.type = 'p';
		
	}
	
	public boolean fight(Tool tool) {
		if(tool.type == 'r') {
			return 2 * getStrength() > tool.getStrength();
		}
		else {
			return getStrength() > 2 * getStrength();
		}
	}
	
	
}

class Scissors extends Tool{
	Scissors(int Strength) {
		setStrength(Strength);
		this.type = 's';
		
	}
	
	public boolean fight(Tool tool) {
		if(tool.type == 'p') {
			return 2 * getStrength() > tool.getStrength();
		}
		else {
			return getStrength() > 2 * getStrength();
		}
	}
	
	
}


public class RockPaperScissorsGame {
	public static void main(String args[]){
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , "+ p.fight(s) );
        System.out.println(p.fight(r) + " , "+ r.fight(p) );
        System.out.println(r.fight(s) + " , "+ s.fight(r) );
    }
}
