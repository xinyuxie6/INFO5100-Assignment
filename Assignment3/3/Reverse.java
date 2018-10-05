package Assignment3;

public class Reverse{
	public static void main(String[] args) {
		String str = "   The sky is     blue    ";
		System.out.println(reverse(str));
}
	
	public static String reverse(String s) {
		String[] words = s.trim().split("\\s++");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length - 1; i > 0; i--)
			sb.append(words[i] + " ");
		sb.append(words[0]);
		return sb.toString();
	}
}