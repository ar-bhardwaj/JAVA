import java.util.*;

public class Duplicates {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 2, 5, 3, 7, };
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = i + 1; j < arr.length; j++) {
			 	if (arr[i] == arr[j]) {
					// System.out.println(arr[i]);
					count++;
				}
			}
			if(count==0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
