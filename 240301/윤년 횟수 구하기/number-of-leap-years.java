import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int leapYear = 0;
        int commonYear = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 100 == 0 && i % 400 != 0) {
                commonYear++;
            } else if (i % 4 == 0) {
                leapYear++;
            } else{
                commonYear++;
            }
        }
        System.out.print(leapYear);
    }
}