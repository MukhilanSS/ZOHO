package zoho.shortcoding;

import java.util.Scanner;

public class singlenumber1
{
    public static int function(int arr[]){
        int ans=0;
        for(int i:arr)
            ans^=i;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums []= {4,1,2,1,2};
        System.out.println(function(nums));

    }
}
