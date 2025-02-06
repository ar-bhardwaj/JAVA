import java.util.*;
public class CountVowels{
	public static void main(String[]args){
		 String msg="aayush nagar has an amazing voice";
		 int count=0;
		 msg=msg.toLowerCase();
		 for(int i =0;i<msg.length();i++){
			 char ch=msg.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				 count++;
			 }
		 }System.out.println(count);
		 
		 
	}
}
 
/*if(ch='') continue;
	else if('aeiou'.contains(ch=='')) count++; */
