import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();
        String t = sc.next();

        for (int i = s.length - 1; i >= 0; i--) {

            if (s[i] == 'z') {
                s[i] = 'a';
            } else {
                s[i]++;
                break;
            }
        }

        String ans = new String(s);

        if (ans.equals(t))
            System.out.println("No such string");
        else
            System.out.println(ans);
    }
}