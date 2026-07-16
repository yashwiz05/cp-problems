import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {

            int d = s.charAt(i) - '0';

            if (d > 4) {
                if (i == 0 && d == 9)
                    System.out.print(9);
                else
                    System.out.print(9 - d);
            } else {
                System.out.print(d);
            }
        }
    }
}