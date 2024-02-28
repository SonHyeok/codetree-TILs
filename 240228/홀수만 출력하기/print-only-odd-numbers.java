import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
                Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            int n2 = sc.nextInt();
            if(n2 % 2 != 0 && n2 % 3 == 0){
                oddNumbers.add(n2);
            }
        }

        for (Integer oddNumber : oddNumbers) {
            System.out.println(oddNumber);
        }
    }
}