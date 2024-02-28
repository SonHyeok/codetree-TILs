import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = 0; int b = 0; int t = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(i == 0){
                continue;
            }

            if (i % 12 == 0) {
                t++;
            } else if (i % 3 == 0) {
                b++;
            } else if(i % 2 == 0){
                k++;
            }
        }

        System.out.print(k + " ");
        System.out.print(b + " ");
        System.out.print(t);

    }
}