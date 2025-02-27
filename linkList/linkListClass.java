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



