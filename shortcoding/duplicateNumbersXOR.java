package zoho.shortcoding;

import java.util.Scanner;

public class duplicateNumbersXOR {
    public static int find(int n,int arr[])
    {
        int xor=0;
        boolean flag[]=new boolean[51];
        for(int i:arr) {
            xor ^= i;
            flag[i]=true;
        }
        for(int i=0;i<51;i++)
        {
            if(flag[i])
                xor^=i;
        }
            return xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //[1,1,2,2] ----> 3
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(find(n,arr));
    }
}
