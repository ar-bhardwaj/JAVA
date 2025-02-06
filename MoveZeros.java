import java.util.*;
public class MoveZeros{
	 public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 0, 7, 8 };
        int n = arr.length;
        int[]ans = move(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print
            (ans[i]+" ");
        }
    }
    static int[] move(int[] arr ,int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz= temp.size();
        for (int i=0;i<nz;i++){
            arr[i]=temp.get(i);
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }
} 