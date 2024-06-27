package zoho.shortcoding;

import java.util.Scanner;

public class findTheDifference {
    public static char find(String s,String t){
        int a[]=new int[26];
        int b[]=new int[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        for(char c:t.toCharArray())
        {
            b[c-'a']++;
        }
        char c='a';
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            {
               c=(char)(i+(int)'a');
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "abcd", t = "abcde";
//        String s=sc.nextLine(),t=sc.nextLine();
        System.out.println(find(s,t));
    }
}
