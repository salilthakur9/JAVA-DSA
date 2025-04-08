/*import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        System.out.print("Queue contains ");
        while (!qu.isEmpty()) {
            System.out.print(qu.poll() + " ");
        }
    }
}*/


/*import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;;
public class queue{
    public static void main(String[] args) {
        String name;
        char ch;
        int i;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        Queue<Character> qu = new LinkedList<>();
        for (i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (ch != ' ') {
                qu.add(ch);
            }
        }
        System.out.println("The modified string is ");
        while (!qu.isEmpty()) {
            System.out.print(qu.poll());
        }
    }
}*/