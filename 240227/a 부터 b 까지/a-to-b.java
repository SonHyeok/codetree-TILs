import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int curnt = a;

        for(int i = a; i <= b; i++){
            System.out.print(curnt + " ");
            if(curnt >= b){
                break;
            }
            else if(curnt % 2 == 1){
                curnt *= 2;
            }
            else if(curnt % 2 == 0){
                curnt += 3;
            }
            
        }
    }
}