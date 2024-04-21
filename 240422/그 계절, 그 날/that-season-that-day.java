import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isLeapYear(y)){
            if(isLeapDate(m, d)){
                System.out.println(season(m));
            }else {
                System.out.println(-1);
            }
        } else {
            if(isNotLeapDate(m,d)){
                System.out.println(season(m));
            }else {
                System.out.println(-1);
            }
        }

    }

    static boolean isLeapYear(int year){ // true == 윤년, false == 윤년 X
        if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else if ((year % 4 == 0 && year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    static String season(int month) {
        if (month <= 5 && month >= 3) {
            return "Spring";

        } else if (month <= 8 && month >= 6) {
            return "Summer";

        } else if (month <= 11 && month >= 9) {
            return "Fall";
        }else {
            return "Winter";
        }
    }

    static boolean isNotLeapDate(int m, int d){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            return d <= 31 && d >= 1;

        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            return d <= 30 && d >= 1;

        } else if (m == 2) {
            return d <= 28 && d >= 1;
        }
        return false;
    }

    static boolean isLeapDate(int m, int d){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            return d <= 31 && d >= 1;

        }else if(m == 4 || m == 6 || m == 9 || m == 11){
            return d <= 30 && d >= 1;

        } else if (m == 2) {
            return d <= 29 && d >= 1;
        }
        return false;
    }
}