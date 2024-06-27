package zoho.shortcoding;

import java.util.Arrays;
import java.util.Scanner;

public class singleNumber3
{
    public static int[] function(int arr[]){
        int xor=0,b1=0,b2=0;
        for(int i:arr)
            xor^=i;
        int rightmost=xor&-xor;
        for(int i:arr)
        {
            if((rightmost&i)==0) b1^=i;
            else b2^=i;
        }
        return new int[]{b1,b2};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums []= {1,2,1,3,2,5};
        System.out.println(Arrays.toString(function(nums)));

    }
}
