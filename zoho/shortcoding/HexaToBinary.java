package zoho.shortcoding;

import java.util.Scanner;

public class HexaToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int decimal=Integer.parseInt(s,16);
        String result =Integer.toBinaryString(decimal);
        System.out.println(result);
    }
}
