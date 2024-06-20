package zoho.shortcoding;

import java.util.*;

public class Self {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("[,\\s]+");
        int left = Integer.parseInt(s[2]);
        int right = Integer.parseInt(s[5]);
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isSelfDividing(int n) {
        for (int digit = n; digit > 0; digit /= 10) {
            if (digit % 10 == 0 || n % (digit % 10) != 0) {
                return false;
            }
        }
        return true;
    }
}
