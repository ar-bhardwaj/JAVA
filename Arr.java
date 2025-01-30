import java.util.*;

public class Arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[3];

		String[] subjects = new String[3];

		int[][] marks = new int[3][3];

		for (int i = 0; i < 3; i++) {
			// System.out.println("names of student");
			names[i] = sc.nextLine();

		}
		for (int i = 0; i < 3; i++) {
			// System.out.println("subject name");
			subjects[i] = sc.nextLine();

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("name of student" + names[i] + "subject name" + subjects[j]);
				marks[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				System.out.println("name " + names[i] + "subjects " + subjects[i] + "markss " + marks[i][j]);
				sum += marks[i][j];
			}
			System.out.println("Sum : " + sum);
			int percent = (sum * 100) / 300;
			System.out.println("Percentage: " + percent + "%");

		}
	}
}
