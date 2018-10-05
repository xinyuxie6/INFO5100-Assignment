package Assignment3;

public class Course {
	private String name;
	private int numberOfStudent;
	private Student[] students = new Student[10];
	Course(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	
	public Student[] getStudent() {
		return students;
	}
	
	public boolean isFull() {
		if (numberOfStudent == 10)
			return true;
		else
			return false;
	}
	
	public void registerStudent(Student student) {
		if(!isFull()) {
			students[numberOfStudent] = student;
			numberOfStudent ++;	
		}
		else {
			System.out.println("The course is full.");
		}
	}
			
}