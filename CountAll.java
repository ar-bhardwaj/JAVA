import java.util.*;
public class CountAll{
	public static void main(String[]args){
		String sentence="a dog BaRked 2 times!!";
		int lowercase=0;
		int upercase=0;
		int digit=0;
		int specialchar=0;
		for(int i =0;i<sentence.length();i++){ 
			char ch= sentence.charAt(i);
			if(Character.isLowerCase(ch)) lowercase++;
			else if(Character.isUpperCase(ch)) upercase++;
			else if(Character.isDigit(ch)) digit++;
			else specialchar++;
		}
		System.out.println(lowercase+" "+upercase+" "+digit+" "+specialchar);

	}
}