import java.util.*;

public class SpecialPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n < 4) {
                System.out.println("-1");
                continue;
            }

            if (n == 4) {
                System.out.println("3 1 4 2");
                continue;
            }
            if (n == 5) {
                System.out.println("4 2 5 3 1");
                continue;
            }

            StringBuilder sb = new StringBuilder();

            // odds in descending order
            for (int i = n; i >= 1; i--) {
                if ((i & 1) == 1) sb.append(i).append(" ");
            }
            // evens in descending order
            for (int i = n; i >= 1; i--) {
                if ((i & 1) == 0) sb.append(i).append(" ");
            }

            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}
