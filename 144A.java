import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int max = -1;
        int min = 101;
        int maxPos = 0;
        int minPos = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] > max) {
                max = a[i];
                maxPos = i;
            }

            if (a[i] <= min) {
                min = a[i];
                minPos = i;
            }
        }

        int ans = maxPos + (n - 1 - minPos);

        if (maxPos > minPos)
            ans--;

        System.out.println(ans);
    }
}