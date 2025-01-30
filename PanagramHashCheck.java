import java.util.*;
public class PanagramHashCheck{
	public static void main(String[] args) {
		   String sentence = "The quick brown fox jumps over the lazy dog";
		   System.out.print(isPanagramH(sentence));
	}
	public static boolean isPanagramH(String str){
		if(str==null||str.isEmpty()){
			return false;
		}
		
		str=str.toLowerCase();
		HashSet<Character> letters=new HashSet<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'){
				letters.add(ch);
			}
		}
		return letters.size() ==26;
	}
}