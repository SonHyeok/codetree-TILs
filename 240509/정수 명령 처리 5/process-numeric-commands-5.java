import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
     static List<Integer> arrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
             int n = sc.nextInt();

        String command;
        int num;


        for (int i = 0; i < n; i++) {
            command = sc.next();

            if(command.equals("push_back")){
                num = sc.nextInt();
                arrayList.add(num);
            } else if (command.equals("pop_back")) {
                if(!arrayList.isEmpty()){
                    arrayList.remove(arrayList.size() - 1);}    
            } else if (command.equals("size")) {
                System.out.println(arrayList.size());
            } else if (command.equals("get")) {
                num = sc.nextInt();
                System.out.println(arrayList.get(num - 1));
            }
        }
    }

}