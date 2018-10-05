package Assignment3;

public class Test {
	public static void main(String[] args) {
		Course course = new Course("INFO5100");
		
		Student a = new Student("a", "NUID001");
		Student b = new Student("b", "NUID002");
		Student c = new Student("c", "NUID003");
		Student d = new Student("d", "NUID004");
		Student e = new Student("e", "NUID005");
		Student f = new Student("f", "NUID006");
		Student g = new Student("g", "NUID007");
		Student h = new Student("h", "NUID008");
		Student i = new Student("i", "NUID009");
		Student j = new Student("j", "NUID0010");
		Student k = new Student("k", "NUID0011");
		
		course.registerStudent(a);
		course.registerStudent(b);
		course.registerStudent(c);
		course.registerStudent(d);
		course.registerStudent(e);
		course.registerStudent(f);
		course.registerStudent(g);
		course.registerStudent(h);
		course.registerStudent(i);
		course.registerStudent(j);
		course.registerStudent(k);

		for (int n = 0; n < course.getNumberOfStudent(); n++) {
			System.out.println(course.getStudent()[n].getName());
		}
	}

}
