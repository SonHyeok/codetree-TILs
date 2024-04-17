import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findNum(a,b));
    }

    public static int findNum(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++) {
            if (findNum2(i)) {
                total += i;
            }
        }
        return total;
    }

    public static boolean findNum2(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}