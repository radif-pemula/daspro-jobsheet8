import java.util.Scanner;

public class Triangle25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }System.out.println();
            i++;
        }int k = n;
        while (k >= 1) {
            int l = 1;
            while (l <= k) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            k--;
        }
        sc.close();
    }
}
