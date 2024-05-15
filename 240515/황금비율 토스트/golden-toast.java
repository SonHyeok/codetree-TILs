import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.out;public class Main {
    public static void main(String[] args) {
        LinkedList<Character> l = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt(); // 문자열 길이
        int cmdCount = scan.nextInt(); // 명령어 개수

        String code = scan.next(); // 입력받는 식빵 개수

        for (int i = 0; i < length; i++) { // 연결리스트에 식빵 추가
            l.addLast(code.charAt(i));
        }

        ListIterator<Character> it = l.listIterator(l.size()); // 가장 마지막 순서부터 Iterator 시작
        for (int i = 0; i < cmdCount; i++) {
            String cmd = scan.next();
            move(cmd, it, scan);
        }

        for (int i = 0; i < l.size(); i++) {
            out.print(l.get(i));
        }
    }

    private static void move(String cmd, ListIterator<Character> it, Scanner scan) {
        if (cmd.equals("L")) {
            if(it.hasPrevious()){
                it.previous();
            }
        } else if (cmd.equals("P")) {
            Character c = scan.next().charAt(0);
            it.add(c);

        } else if (cmd.equals("R")) {
            if (it.hasNext()) {
                it.next();
            }

        } else if (cmd.equals("D")) {
            if(it.hasNext()){
                it.next();
                it.remove();
            }
        }
    }
}