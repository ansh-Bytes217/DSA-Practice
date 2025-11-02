import java.util.*;

public class ReverseSortSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        
        if (isSorted(a)) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        int l = -1, r = -1;

        
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                if (l == -1) l = i;
                r = i + 1;
            }
        }


        reverse(a, l, r);

        if (isSorted(a)) {
            System.out.println("yes");
            System.out.println((l + 1) + " " + (r + 1));
        } else {
            System.out.println("no");
        }
    }

    
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
