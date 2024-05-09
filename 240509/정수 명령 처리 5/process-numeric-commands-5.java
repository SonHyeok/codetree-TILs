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
                pushBack(num);
            } else if (command.equals("pop_back")) {
                popBack();
            } else if (command.equals("size")) {
                arraySize();
            } else if (command.equals("get")) {
                num = sc.nextInt();
                getNumber(num);
            }
        }
    }

    public static void pushBack(int k){
        arrayList.add(k);
    }


    public static void popBack(){
        if(!arrayList.isEmpty()){
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static void arraySize() {
        System.out.println(arrayList.size());
    }

    public static void getNumber( int idx) {
        System.out.println(arrayList.get(idx - 1));
    }
}