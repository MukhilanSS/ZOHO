package zoho.shortcoding;

import java.util.Scanner;

public class singleNumber2
{
    public static int function(int arr[]){
        int ones=0,twos=0;
        for(int i:arr){
            ones=(ones^i)&~twos;
            twos=(twos^i)&~ones;
        }
        return ones;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums []= {0,1,0,1,0,1,99};
        System.out.println(function(nums));

    }
}
