import java.util.*;
public class UnionofArr{
	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arra = new int[a];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = sc.nextInt();
        }
        int[] arrb = new int[b];
        for (int i = 0; i < arrb.length; i++) {
            arrb[i] = sc.nextInt();
        }
        HashSet<Integer> union = new HashSet<>();
        for (int i = 0; i < a; i++) {
            union.add(arra[i]);
        }
        for (int i = 0; i < b; i++) {
            union.add(arrb[i]);
        }
        System.out.println(union);
	}	
}
