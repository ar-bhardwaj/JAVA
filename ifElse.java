import java.util.*;
public class ifElse{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int Mmarks=sc.nextInt();
		int Cmarks=sc.nextInt();
		int Pmarks=sc.nextInt();
		int Total=sc.nextInt();
		int Ototal=Mmarks+Cmarks+Pmarks;
		double percentage=((double)Ototal/Total)*100;
		
		System.out.println("Maths marks: "+Mmarks);
		System.out.println("Chemistry marks: "+Cmarks);
		System.out.println("Physics marks: "+Pmarks);
		System.out.println(" ");
		System.out.println("Total marks: "+Total);
		System.out.println("Obtained total marks: "+Ototal);
		System.out.println("Total Percentage: "+percentage+"%");
		System.out.println(" ");
	    System.out.println("Grade:");

		
		
		if(percentage>75){
			System.out.println("distinction");
		}
		else if(percentage>40&&percentage<75){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
}