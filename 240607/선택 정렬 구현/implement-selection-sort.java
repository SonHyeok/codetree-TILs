import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] integers = new int[count];



        for (int i = 0; i < count; i++) {
            integers[i] = sc.nextInt();
        }

        for (int i = 0; i < integers.length - 1; i++) {
            int min_idx, temp;
            min_idx = i;

            for (int j = i + 1; j < integers.length; j++) {
                if (integers[j] < integers[min_idx]) {
                    min_idx = j;
                }
            }
            temp = integers[i];
            integers[i] = integers[min_idx];
            integers[min_idx] = temp;
        }

        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }
    }
}