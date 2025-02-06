import java.util.*;
public class RotationCheck{
	public static void main(String[]args){
		String str1= "aditi";
		String str2="tiadi";
		System.out.println(isRotated(str1,str2));
		
	}
	public static boolean isRotated(String str1, String str2){
		if(str1.length()!=str2.length())
			return false;
		String concat=str1+str1;
		return concat.contains(str2);
		
	}
}  