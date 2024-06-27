package zoho.shortcoding;

import java.util.Scanner;

public class singleNonDuplicate
{
    public static int function(int n,int arr[]){
        int start=0,end=n-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            int last=mid;
            if(arr[mid]==arr[mid-1]) last=mid;
            else if(arr[mid]==arr[mid+1]) last=mid+1;
            else return arr[mid];
            if(last%2!=0) start=last+1;
            else end=last-2;
        }
        return arr[end];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,2,3,3,4,4,8,8};
        int n=arr.length;
        System.out.println(function(n,arr));
    }
}
