import java.util.*;

public class Concat2Strings {
	public static void main(String[] args) {
		String s1 = "Aditi";
		String s2 = "Aditi";
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2);
		System.out.println(sb);
	}
}