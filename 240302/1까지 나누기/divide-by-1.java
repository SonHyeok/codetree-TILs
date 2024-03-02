import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = n;
        int score = 0;

        for (int i = 1; i <= n; i++) {
            if(result > 1){
                result /= i;
                score++;
            }else {
                break;

            }
        }
        System.out.println(score);

    }
}