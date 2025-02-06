import java.util.*;
class LineCompare{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st = sc.nextLine();
        if(s.length()>st.length()){
            System.out.println("s is greater");
        }
        else if(s.length()<st.length()){
            System.out.println("st is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}