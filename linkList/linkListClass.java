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



import java.util.*;
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
}