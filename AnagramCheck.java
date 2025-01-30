import java.util.*;
public class AnagramCheck{
	public static void main(String[]args){
		String str1="care";
		String str2="race";
		System.out.println(isAnagram(str1,str2));
	}
	public static boolean isAnagram(String str1, String str2){
		if(str1.length()!=str2.length()) return false;
		if(str1==null||str2==null) return false;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[]ch1=str1.toCharArray();
		char[]ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1,ch2);
		
		}
	}
