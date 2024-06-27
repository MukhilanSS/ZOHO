package zoho.shortcoding;

import java.util.Arrays;
import java.util.Scanner;

public class pushZerosToEnd {
    public static int[] movezeros(int n,int arr[]){
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0) {
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
                pos++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={4,1,0,4,0,6,9,0,7,0,3,6,0,5,0,5,0,6,0,0,7,0,7};
        System.out.println(Arrays.toString(movezeros(arr.length,arr)));
    }
}
