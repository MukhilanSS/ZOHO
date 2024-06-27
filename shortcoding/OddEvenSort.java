package zoho.shortcoding;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int i=0,j=n-1,max,index = 0;
        while(i!=j)
        {
            max=0;
            for(int k=i;k<=j;k++){
                if(arr[k]>max){
                    max=arr[k];
                    index=k;
                }
            }
            if(max%2!=0)
            {
                arr[index]=arr[i];
                arr[i]=max;
                i++;
            }
            else {
                arr[index]=arr[j];
                arr[j]=max;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
