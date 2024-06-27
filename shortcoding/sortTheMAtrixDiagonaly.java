package zoho.shortcoding;

import java.util.Arrays;
import java.util.Scanner;

public class sortTheMAtrixDiagonaly {
    public static void sort(int [][]mat,int row,int col,int m,int n){
        int arr[]=new int[101]; //countsort
        int r=row,c=col;
        while(r<m && c<n){
            arr[mat[r++][c++]]++;
        }
        r=row;
        c=col;
        for(int i=1;i<101;i++)
        {
            if(arr[i]>0)
            {
                int count=arr[i];
                while(count-->0){
                    mat[r++][c++]=i;
                }
            }
        }
    }
    public static int[][] matrix(int mat[][]){
        int m=mat.length;
        int n=mat[0].length;
        for(int col=0;col<n;col++)
        {
            sort(mat,0,col,m,n);
        }
        for(int row=1;row<m;row++)
        {
            sort(mat,row,0,m,n);
        }
        return mat;
    }
    public static void print(int mat[][])
    {
        for(int []row:mat){
            System.out.print("[ ");

            for(int val:row)
                System.out.print(val+" ");
        System.out.println("] ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        matrix(mat);
        print(mat);
    }
}
