import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();


        if(makeDate(m,d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean makeDate(int m, int d){
        try{
            LocalDate date = LocalDate.of(2021, m, d);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}