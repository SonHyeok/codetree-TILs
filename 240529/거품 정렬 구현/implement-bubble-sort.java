import java.util.*;
import static java.lang.System.out;public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = 0;
        int[] intList = new int[n];

        for (int i = 0; i < n; i++) {
            intList[i] = sc.nextInt();
        }

        for (int i = 0; i < intList.length - 1; i++) {
            for (int j = 0; j < intList.length - 1; j++) {
                if (intList[j] > intList[j + 1]) {
                    tmp = intList[j];
                    intList[j] = intList[j + 1];
                    intList[j + 1] = tmp;
                }
            }
        }

       String collect = Arrays.stream(intList).
               mapToObj(String::valueOf).
               collect(Collectors.joining(" "));

       out.println(collect);

        // for (int i : intList) {
        //     out.print(i + " ");
        // }
    }
}