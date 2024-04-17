import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findNum(a, b));
    }

    public static int findNum(int a,int b){
        int total = 0;
        for (int i = a; i <= b; i++) {
            if(i % 3 == 0 || isThree(i)){
                total++;
            }
        }
        return total;
    }

    public static boolean isThree(int n){
        if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
            return true;
        } else if (n / 10 == 3 || n / 10 == 6 || n / 10 == 9) {
            return true;
        }
        return false;
    }
}