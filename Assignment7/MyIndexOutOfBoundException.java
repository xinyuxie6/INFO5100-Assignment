package assignment7;

public class MyIndexOutOfBoundException extends Exception{
	private int lowerBound;
	private int upperBound;
	private int index;
	
	public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
	
	public String toString() {
		return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
	}
	
	public static void main(String[] args) {
		int lower = 0;
		int upper = 9;
		int index = 10;
		try {
			indexOutOfBoundException(lower, upper, index);
		}catch(MyIndexOutOfBoundException e){
			e.printStackTrace();
		}
	}
	
	public static void indexOutOfBoundException(int lowerBound, int upperBound, int index) throws MyIndexOutOfBoundException{
		if(index >= lowerBound && index <= upperBound) {
			return;
		}else {
			throw new MyIndexOutOfBoundException(lowerBound, upperBound, index);
		}
	}
	
}
