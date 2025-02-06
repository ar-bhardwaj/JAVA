import java.util.*;

public class Intersection {
	public static void main(String[] args) {
		int arr1[] = { 22, 33, 44, 55, 66 };
		int arr2[] = { 55, 66, 77, 88, 99 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[j]);
				}
			}
		}

	}
} 