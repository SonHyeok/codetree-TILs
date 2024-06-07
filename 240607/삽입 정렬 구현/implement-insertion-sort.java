import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] list = new int[count];

        for(int i = 0; i < count; i++){
            list[i] = sc.nextInt();
        }

        for(int i = 1; i < list.length; i++){
            int j = i - 1;
            int key = list[i];

            while( j >= 0 && list[j] > key){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}