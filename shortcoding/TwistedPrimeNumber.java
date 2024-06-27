package zoho.shortcoding;

import java.util.Scanner;

public class TwistedPrimeNumber {
    public static int twistedprime(int n){
        if(isprime(n) && isprime(reverse(n))) return 1;
        return 0;
    }
    public static int reverse(int n){
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public static boolean isprime(int n)
    {
        if(n<=1)return false;
        if(n%2==0 || n%3==0)return false;
        if(n<=3)return true;
        for(int i=5;i*i<n;i+=6)
        {
            if(n%i==0 && n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(twistedprime(n));

    }
}
