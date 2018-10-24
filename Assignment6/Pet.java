
public class Pet {
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;
	
	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return name;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		if(sexid >= 0 && sexid < 4) {
			this.sex = sexid;
		}
	}
	
	public String getSex() {
		if(sex == MALE) {
			return "Male";
		}
		else if(sex == FEMALE){
			return "Female";
		}
		else if(sex == SPAYED) {
			return "Spayed";
		}
		else {
			return "Neutered";
		}
		
	}
	
	public String toString() {
		return name + " owned by " + ownerName + "\n" + "Color: " +color + "\n" + "Sex: " + getSex() + "\n";
		
	}
	
}
