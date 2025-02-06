import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[a];
        for (int i = 0; i < a; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < a; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                
                visited[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }

    }
}