import java.util.*;
public class Reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String empty=" ";
        for(int i =str.length()-1;i>=0;i--){
            //str=str.trim();
            empty+=str.charAt(i);
           
        }
        System.out.print(empty);
    }
    
}
