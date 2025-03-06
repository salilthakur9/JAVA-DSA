/*import java.util.LinkedList;
public class linkListClass {
    public static void main(String args[]){
        LinkedList<String> lang=new LinkedList<>();
        lang.add("Python");lang.add("C");lang.add("C++");lang.add("Java");
        System.out.println("Linked List: "+lang);
    }
}*/


/*import java.util.*;
public class linkListClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> state = new LinkedList<>();

        System.out.println("Enter the names of states (type 'exit' to stop):");
        while (true) {
            System.out.print("Enter state name: ");
            String stateName = sc.nextLine();
            if (stateName.equalsIgnoreCase("exit")) {
                break;
            }
            state.add(stateName);
        }

        System.out.println("You have entered the following states:");
        for (String s : state) {
            System.out.println(s);
        }

        sc.close();
    }
}*/




/*import java.util.*;
public class linkListClass{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        LinkedList<String> names= new LinkedList<>();

        System.out.println("Enter the names of the Students or type X to exit: ");
        while(true){
            System.out.print("Enter the name of the student: ");
            String studentName=sc.nextLine();
            if(studentName.equalsIgnoreCase("X")){
                break;
            }names.add(studentName);
        }
        System.out.println("these are the names: ");
        for(String n:names){
            System.out.println(n);
        }sc.close();
    }
}*/



/*import java.util.*;
public class linkListClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new element");
            System.out.println("2. Delete an element");
            System.out.println("3. Show the size of the list");
            System.out.println("4. Exit");
            System.out.print("----------------------------------------------Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("----------------------------------------------Enter the element to add: ");
                    String elementToAdd = sc.nextLine();
                    list.add(elementToAdd);
                    System.out.println("----------------------------------------------Element added.");
                    break;

                case 2:
                    System.out.print("----------------------------------------------Enter the element to delete: ");
                    String elementToDelete = sc.nextLine();
                    if (list.remove(elementToDelete)) {
                        System.out.println("----------------------------------------------Element deleted.");
                    } else {
                        System.out.println("----------------------------------------------Element not found.");
                    }
                    break;

                case 3:
                    System.out.println("----------------------------------------------The size of the list is: " + list.size());
                    break;

                case 4:
                    System.out.println("----------------------------------------------Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("----------------------------------------------Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }
}*/


/*import java.util.Scanner;

public class linkListClass {
    class Node {
        String name;
        Node next;

        public Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(String name) {
        Node newnode = new Node(name);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String args[]) {
        linkListClass ll = new linkListClass();
        int choice = 1;
        String name;
        Scanner sc = new Scanner(System.in);
        ll.addNode("Chandighar");
        ll.addNode("Shimla");
        ll.addNode("Delhi");
        while (choice != 4) {
            System.out.println("1-Add Element!");
            System.out.println("2-Display Element!");
            System.out.println("3-Count Nodes!");
            System.out.println("4-Exit!");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("Enter the element to be added: ");
                name = sc.nextLine();
                ll.addNode(name);
            } else if (choice == 2) {
                ll.display();
            } else if (choice == 3) {
                System.out.println("Total number of nodes: " + ll.countNodes());
            } else {
                System.exit(0);
            }
        }
        sc.close();
    }
}*/