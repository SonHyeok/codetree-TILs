import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();


        operations(a,c,o);
    }

    public static boolean operations(int a, int c , String o){
        if(o.equals("*")){
            System.out.println(a + " " + o + " " + c + " = " + (a * c));
            return true;
        } else if (o.equals("%")) {
            System.out.println(a + " " + o + " " + c + " = " + (a % c));
            return true;

        }else if (o.equals("+")) {
            System.out.println(a + " " + o + " " + c + " = " + (a + c));
            return true;

        }else if (o.equals("-")) {
            System.out.println(a + " " + o + " " + c + " = " + (a - c));
            return true;

        }else{
            return false;
        }
    }
}