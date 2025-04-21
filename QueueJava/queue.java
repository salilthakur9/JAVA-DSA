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



/*public class queue {
    int[] arr;
    int front,rear,maxSize;

    public queue(int size) 
    {
        arr=new int[size];
        front=-1;
        rear=-1;
        maxSize=size;
    }

    public boolean isFull()
    {
        return rear==maxSize-1;
    }

    public boolean isEmpty() 
    {
        return front==-1;
    }

    public void enqueue(int value)
    {
    	if (isFull()) 
    	{
            System.out.println("Queue is full");
            return;
        }
        if (front==-1)
        {
        	front = 0;
        }
        rear++;
        arr[rear]=value;
        System.out.println("Enqueued: "+value);
    }

    public int dequeue() 
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedValue = arr[front];
        if (front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front++;
        }
        return dequeuedValue;
    }

    public static void main(String[] args) 
    {
        queue q = new queue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Dequeued: "+q.dequeue());
    }
}*/



/*import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class queue
{
	public static void main(String[] args) {
		String name;
		int i;
		char ch;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		
		Queue<Character> qu=new LinkedList<>();
		for(i=0;i<name.length();i++)
		{
			ch=name.charAt(i);
			if (!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
			{
				qu.add(ch);
			}
		}
		System.out.println("The modified string is ");
		while (!qu.isEmpty())
		{
			System.out.print(qu.poll());
		}
	}
}*/



/*import java.util.*;
public class queue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println("Deque: " + deque);
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque: " + deque);
	} 
}*/



/*import java.util.*;
public class queue{
    public static void main(String args[]){
        String name;
        int i,len,flag=0;
        Deque<Character> dq=new LinkedList<>();
        System.out.println("Enter the String: ");
        Scanner sc=new Scanner(System.in);
        name =sc.nextLine();
        for(i=0;i<name.length();i++){
            dq.add(name.charAt(i));
        }
        while(dq.size()>1){
            if(dq.removeFirst()!=dq.removeLast()){
                flag=1;break;
            }
        }
        if(flag==1){
            System.out.println("String is not palindrome!");
        }else{
            System.out.println("String is palindrome!");
        }
    }
}*/