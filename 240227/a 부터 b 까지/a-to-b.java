import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int curnt = a;

        while(curnt <= b){
            System.out.print(curnt + " ");
            if(curnt % 2 == 0){
                curnt += 3;
            }
            else{
                curnt *= 2;
            }
        }
    }
}