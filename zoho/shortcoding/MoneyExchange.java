package zoho.shortcoding;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int currency[]={2000,500,200,100,50,20,10,5,2,1};
        int notes[]=new int[10];
        for(int i=0;i<10;i++){
            if(amount>currency[i])
            {
                notes[i]=amount/currency[i];
                amount%=currency[i];
            }
        }
        for(int i=0;i<10;i++){
            if(notes[i]!=0)
                System.out.println(currency[i]+"--->"+notes[i]);
        }
    }
}
