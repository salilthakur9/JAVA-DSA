/*import java.util.Scanner;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        int number, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        while (number != 0) {
            rem = number % 2;
            st.push(rem);
            number = number / 2;
        }
        System.out.print("The binary equivalent is: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
        sc.close(); 
    }
}*/