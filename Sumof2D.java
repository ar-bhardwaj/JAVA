import java.util.*;
public class Sumof2D{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int m=sc.nextInt();
		int arrn[][]=new int[n][m];
		int arrm[][]=new int[n][m];
		int sumarr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arrn[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arrm[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				sumarr[i][j]=arrn[i][j]+arrm[i][j];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(sumarr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
 