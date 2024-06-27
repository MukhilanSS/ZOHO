package zoho.shortcoding;

import java.util.*;
public class Diamond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2,st=1;
        int count=1;
        for(int i=1;i<=n;i++)
        {
                for (int s = 0; s < sp; s++)
                    System.out.print(" ");
                for (int j = 1; j<=st; j++) {
                    System.out.print("* ");
//                    System.out.print(count+" ");
                    count++;
                }

                if(i<n/2){
                    count=1;
                    sp--;
                    st++;
                }
                else{
                    count=2;
                    count--;
                    sp++;
                    st--;
                }
            System.out.println();
            }

        }
    }

