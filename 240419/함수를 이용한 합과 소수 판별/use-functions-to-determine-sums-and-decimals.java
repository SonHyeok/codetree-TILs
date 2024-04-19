import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(operations(a,c));
    }

    public static int operations(int a, int b){
        int total = 0;
        for(int i = a; i <= b; i++){
            if(isDecimal(i)){
                if(isEven(i)){
                    total++;
                }
            }
        }
        return total;
    }

    public static boolean isDecimal(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int k){
        if(((k / 10) + (k % 10)) % 2 == 0){
            return true;
        }
        return false;
    }
}