package Assignment3;

public class TestMood {
	public static void main(String[] args) {
		MoodyObject sad = new SadObject();
		MoodyObject happy = new HappyObject();
		PsychiatristObject p = new PsychiatristObject();
		p.examine(happy);
		p.observe(happy);
		p.examine(sad);
		p.observe(sad);
	}
}