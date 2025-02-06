import java.util.*;
class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String s = sc.nextLine();
        System.out.println("Enter position to replace the word");
        int p = sc.nextInt();
        System.out.println("Enter the word that is to be replace");
        String word = sc.next();
        String[]wordArray = s.split(" ");
        for(int i=0;i<wordArray.length;i++){
            if(i==p){
                wordArray[i]=word;
                break;
            }
            
        }
        for(int i=0;i<wordArray.length;i++){
            System.out.print(wordArray[i]+" ");
        }
    }
}