import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int result = (n * m) / gcd(n,m);
    System.out.println(result);


    }

    public static int gcd(int a, int b){
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
    }
}