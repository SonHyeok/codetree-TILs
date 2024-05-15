import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.out;public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            checkCommand(scan, l);
        }

    }

    private static void checkCommand(Scanner scan, LinkedList<Integer> l) {
        String cmd = scan.next();
        int num;

        if (cmd.equals("push_front")) {
            num = scan.nextInt();
            l.addFirst(num);
        } else if (cmd.equals("push_back")) {
            num = scan.nextInt();
            l.addLast(num);
        } else if (cmd.equals("pop_front")) {
            out.println(l.pollFirst());

        }else if (cmd.equals("pop_back")) {
            out.println(l.pollLast());

        }else if (cmd.equals("size")) {
            out.println(l.size());

        }else if (cmd.equals("empty")) {
            if(l.isEmpty()){
                out.println(1);
            }else {
                out.println(0);
            }
        }else if (cmd.equals("front")) {
            out.println(l.peekFirst());

        } else if (cmd.equals("back")) {
            out.println(l.peekLast());
        }
    }
}