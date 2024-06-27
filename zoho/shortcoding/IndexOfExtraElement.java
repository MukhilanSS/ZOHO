package zoho.shortcoding;

import java.util.Scanner;

public class IndexOfExtraElement {
    public static int function(int n,int arr1[],int arr2[]){
        int start=0,end=n-2,index=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr1[mid]==arr2[mid]) start=mid+1;
            else{
                index=mid;
                end=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=7;
        int arr1[] = {2,4,6,8,9,10,12}, arr2[] = {2,4,6,8,10,12};
        System.out.println(function(n,arr1,arr2));

    }
}
