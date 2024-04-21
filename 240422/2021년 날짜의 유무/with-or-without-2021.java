import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();



        if(isRightDate(m, d)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    
    static boolean isRightDate(int m, int d){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            return d <= 31 && d >= 1;

        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            return d <= 30 && d >= 1;

        } else if (m == 2) {
            return d <= 28 && d >= 1;
        }
        return false;
    }
}