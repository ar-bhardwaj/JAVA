import java.util.*;
public class ZigZag{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int zigzag[]=new int[2*n];
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			zigzag[2*i]=arr1[i];
			zigzag[2*i+1]=arr2[i];
			
		}
		for(int num: zigzag){
			System.out.print(num+" ");
		}
	
	}
} 