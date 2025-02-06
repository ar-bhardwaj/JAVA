
public class PanagramCheck{
	public static void main(String[] args) {
		   String sentence = "The quick brown fox jumps over the lazy dog";
		   System.out.print(isPanagram(sentence));
	}
	public static boolean isPanagram(String str){
		boolean[] letters=new boolean[26];
		str=str.toLowerCase();
		
		for(int i =0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'){
				letters[ch-'a']= true;
			}
		}
		for(int i =0;i<letters.length;i++){
			if(!letters[i]) return false;
		}
		return true;
	}
}	   