import java.util.*;
public class FrequencyofAlphabet{
	public static void main(String[]args){
		String msg="ashu is good boi";
		
		boolean[]visited=new boolean[256];
		for(int i=0;i<msg.length();i++){
			char ch=msg.charAt(i);
			int count=0;
			int idx=ch-'a';
			if(ch==' '||visited[idx]) continue;
			
			for(int j=0;j<msg.length();j++){
				if(msg.charAt(j)==ch) count++;
			}
			System.out.println(ch+" : "+count);
			visited[ch]=true;
		}
	}
}