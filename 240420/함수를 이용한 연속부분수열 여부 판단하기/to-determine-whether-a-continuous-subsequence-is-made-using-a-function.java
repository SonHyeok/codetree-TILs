import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] n1 = new int[a];
        int[] n2 = new int[b];

        makeList(n1,sc);
        makeList(n2,sc);

        if(isSequence(n1,n2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean isSequence(int[] n1, int[] n2) {
        for (int i = 0; i < n2.length; i++) {
            for (int k = 0; k < n1.length; k++) {
                if(isSame(n2[i],n1[k])){
                    if(((i + 1) <= (n2.length - 1)) && ((k + 1) <= (n1.length - 1))){
                        if(isSame(n2[i + 1], n1[k + 1])){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void makeList(int[] n, Scanner sc){
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
    }

    public static boolean isSame(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }
}