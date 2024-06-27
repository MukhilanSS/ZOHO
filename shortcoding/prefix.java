package zoho.shortcoding;

import java.util.*;

public class prefix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] strs = input.substring(1, input.length() - 1).split("\",\"");
        int i=0;
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[strs.length-1];
        System.out.println(a+"  "+b);
        while(i<a.length() && i<b.length()){
            if(a.charAt(i)==b.charAt(i))
                i++;
            else
                break;
        }
        System.out.println(b.substring(i));
    }
}

