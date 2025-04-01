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



/*import java.util.*;

public class linkListClass {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();
        int choice = 1;
        String name;
        Scanner sc = new Scanner(System.in);
        ll.add("Punjab");
        ll.add("Jammu");
        ll.add("Goa");

        while (choice != 5) {
            System.out.println("\nChoose an option:");
            System.out.println("1-Add Element!");
            System.out.println("2-Size of Linked List!");
            System.out.println("3-Sort Linked list");
            System.out.println("4-Search linked list");
            System.out.println("5-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    name = sc.nextLine();
                    ll.add(name);
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.println("Size of the linked list: " + ll.size());
                    break;

                case 3:
                    Collections.sort(ll);
                    System.out.println("Sorted linked list: " + ll);
                    break;

                case 4:
                    System.out.print("Enter the element to search: ");
                    name = sc.nextLine();
                    if (ll.contains(name)) {
                        System.out.println("Element found in the linked list.");
                    } else {
                        System.out.println("Element not found in the linked list.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }
}*/



/*import java.util.*;

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
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        linkListClass ll = new linkListClass();
        int choice = 1;
        String name;
        Scanner sc = new Scanner(System.in);
        ll.addNode("salil");
        ll.addNode("salillll");
        ll.addNode("salillllllll");
        while (choice != 3) {
            System.out.println("1-Add element");
            System.out.println("2-Display");
            System.out.println("3-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            if (choice == 1) {
                System.out.print("Enter the element to be added: ");
                name = sc.nextLine();
                ll.addNode(name);
            } else if (choice == 2) {
                ll.display();
            } else if (choice == 3) {
                System.out.println("Exiting program.");
                sc.close();
                return;
            } else {
                System.out.println("Invalid choice! Please choose a valid option.");
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
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean search(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        Node index = null;
        String temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.name.compareTo(index.name) > 0) {
                    temp = current.name;
                    current.name = index.name;
                    index.name = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public static void main(String args[]) {
        linkListClass ll = new linkListClass();
        int choice = 1;
        String name;
        Scanner sc = new Scanner(System.in);
        ll.addNode("salil");
        ll.addNode("salillll");
        ll.addNode("salillllllll");
        while (choice != 5) {
            System.out.println("1-Add element");
            System.out.println("2-Display");
            System.out.println("3-Search");
            System.out.println("4-Sort");
            System.out.println("5-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be added: ");
                    name = sc.nextLine();
                    ll.addNode(name);
                    break;
                case 2:
                    ll.display();
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    name = sc.nextLine();
                    if (ll.search(name)) {
                        System.out.println("Element found in the linked list.");
                    } else {
                        System.out.println("Element not found in the linked list.");
                    }
                    break;
                case 4:
                    ll.sort();
                    System.out.println("Linked list sorted.");
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }
}*/



/*import java.util.*;
public class linkListClass{
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    Node head=null;
    Node tail=null;

    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            head.prev=null;
            tail.prev=null;
        }else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
            tail.next=null;
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty!");
            return;
        }System.out.println("Nodes of doubly linked list: ");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }System.out.println();
    }
    public void reverseddisplay(){
        Node current=tail;
        if(tail==null){
            System.out.println("List is empty!");
            return;
        }System.out.println("Nodes of doubly linked list: ");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.prev;
        }
        System.out.println();
    }
    public static void main(String args[]){
        linkListClass dl = new linkListClass();
        dl.addNode(10);
        dl.addNode(20);
        dl.addNode(30);
        dl.addNode(40);
        dl.addNode(50);

        dl.display();
        dl.reverseddisplay();
    }
}*/



/*import java.util.*;
public class linkListClass {
    class Node {
        String name;
        Node prev;
        Node next;
        public Node(String name) {
            this.name = name;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Nodes of doubly linked list:");
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String args[]) {
        linkListClass dl = new linkListClass();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String name;

        while (choice != 4) {
            System.out.println("\nChoose an option:");
            System.out.println("1-Add element");
            System.out.println("2-Display");
            System.out.println("3-Size");
            System.out.println("4-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the name to be added: ");
                    name = sc.nextLine();
                    dl.addNode(name);
                    break;
                case 2:
                    dl.display();
                    break;
                case 3:
                    System.out.println("Size of the linked list: " + dl.size());
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }
}*/



/*import java.util.*;
public class linkListClass {
    class Node {
        int rollno;
        Node next;

        Node(int rollno) {
            this.rollno = rollno;
        }
    }

    Node head = null;
    Node current;

    public void addNode(int rollno) {
        Node newnode = new Node(rollno);
        if (head == null) {
            head = newnode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    public void addNodeAtStart(int roll) {
        Node newNode = new Node(roll); 
        newNode.next = head; 
        head = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty linked list!");
        } else {
            current = head;
            System.out.print("Nodes are: ");
            while (current != null) {
                System.out.print(current.rollno + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void countNodes(){
        int count=0;
        if(head==null){
            System.out.println("Empty linked list!");
        }else{
            Node current=head;
            while(current!=null){
                count++;
                current=current.next;
            }System.out.println("Numbers of nodes are "+count);
        }
    }

    public void search(int key){
        Node current;
        int flag=0,pos=1;
        current=head;
        while(current!=null){
            if(current.rollno==key){
                flag=1;
                break;
            }current=current.next;
            pos++;
        }
        if(flag==1){
            System.out.println("Element found in the linked list at "+pos+" position.");
        }else{
            System.out.println("Element not found!");
        }
    }

    public static void main(String args[]) {
        linkListClass ll = new linkListClass();
        ll.display(); 
        ll.addNode(10); 
        ll.addNode(20);
        ll.addNode(30);
        ll.display();

        ll.addNodeAtStart(0); 
        ll.display(); 
        ll.countNodes();
        ll.search(20);
        ll.search(100);
    }
}*/





/*public class linkListClass {
	class Node
	{
		int rollno;
		Node next;
		
		Node(int rollno)
		{
			this.rollno=rollno;
		}
	}

	Node head=null;
	Node current;
	public void addNode(int roll)
	{
		Node newnode=new Node(roll);
				
		if (head==null)
		{
			head=newnode;
		}
		else
		{
			current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newnode;
		}
	}
	
	public void addNodeAtStart(int roll)
	{
		Node newnode=new Node(roll);
		newnode.next=head;
		head=newnode;
	}
	
	public void insert(int key,int data)
	{
		Node newnode,current=head;
		int flag=0;
		while (current!=null)
		{
			if (current.rollno==key)
			{
				flag=1;
				newnode=new Node(data);
				newnode.next=current.next;
				current.next=newnode;
				current=newnode;
				break;
			}
			current=current.next;
		}
		if (flag==0)
		{
			System.out.println("Node not found");
		}
	}
	
	public void delete(int key)
	{
		Node current,temp;
		current=head;
		int flag=0;
		if (current.rollno==key)
		{
			head=current.next;
		}
		else
		{
			temp=current.next;
			while (temp!=null)
			{
				if (temp.rollno==key)
				{
					current.next=temp.next;
					flag=1;
					break;
				}
				current=temp;
				temp=temp.next;
			}
			if (flag==0)
			{
				System.out.println("Node not found");
			}
		}
	}
	
	public void display()
	{
		if (head==null)
		{
			System.out.println("Empty Linked List");
		}
		else
		{
			current=head;
			System.out.print("Nodes are ");
			while(current!=null)
			{
				System.out.print(current.rollno+" ");
				current=current.next;
			}
			System.out.println();
		}
	}
	
	public void countNodes()
	{
		int count=0;
		if (head==null)
		{
			System.out.println("Empty linked list");
		}
		else
		{
			Node current=head;
			while (current!=null)
			{
				count++;
				current=current.next;
			}
			System.out.println("Number of nodes are "+count);
		}
	}
	
	public void search(int key)
	{
		Node current;
		int flag=0,pos=1;
		
		current=head;
		while (current!=null)
		{
			if (current.rollno==key)
			{
				flag=1;
				break;
			}
			current=current.next;
			pos++;
		}
		if (flag==1)
		{
			System.out.println("Element found in the linked list at "
		+pos+" position");
		}
		else
		{
			System.out.println("Element not found in the linked list");
		}
	}
	
	public void sort()
	{
		Node current,nextnode;
		current=head;
		int temp;
		
		while (current.next!=null)
		{
			nextnode=current.next;
			while (nextnode!=null)
			{
				if (current.rollno > nextnode.rollno)
				{
					temp=current.rollno;
					current.rollno=nextnode.rollno;
					nextnode.rollno=temp;
				}
				nextnode=nextnode.next;
			}
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		linkListClass ll=new linkListClass();
		ll.display();
		ll.addNode(70);
		ll.addNode(20);
		ll.addNode(50);
		ll.display();
		
		ll.addNodeAtStart(48);
		ll.display();
		ll.insert(20,90);
		ll.display();
		ll.delete(48);
		ll.display();
		ll.delete(90);
		ll.display();
		ll.countNodes();
		ll.search(20);
		ll.search(90);
		ll.display();
		ll.sort();
		ll.display();
	
	}
}*/



/*public class linkListClass {
	class Node
	{  
		int rollno;
		Node prev;
		Node next;

		public Node(int rollno)
		{  
			this.rollno=rollno;
		}  
	}  
	 
	Node head=null;
	Node tail=null;  
		  
	public void addNode(int data)
	{  
		Node newnode = new Node(data);  
		  
		if(head==null)
		{
		    head=tail=newnode;  
		    
		    head.prev=null;  
		    
		    tail.next=null;  
		}
		else
		{  
			tail.next=newnode;  
		    
		    newnode.prev=tail;  
		    
		    tail=newnode;  
		     
		    tail.next=null;
		}  
	}
	
	public void addNodeAtStart(int roll)
	{
		Node newnode=new Node(roll);
		newnode.prev=null;
		newnode.next=head;
		head.prev=newnode;
		head=newnode;
	}
	
	public void insert(int key,int data)
	{
		Node newnode,current=head;
		int flag=0;
		while (current!=null)
		{
			if (current.rollno==key)
			{
				flag=1;
				newnode=new Node(data);
				newnode.next=current.next;
				newnode.prev=current;
				current.next.prev=newnode;
				current.next=newnode;
				current=newnode;
			}
			current=current.next;
		}
		if (flag==0)
		{
			System.out.println("Node not found");
		}
	}
	
	public void display()
	{   
		Node current=head;  
		
		if(head==null)
		{  
			System.out.println("List is empty");  
			return;  
        }
		System.out.println("Nodes of doubly linked list: ");  
		
		while(current!=null)
		{    
			System.out.print(current.rollno+" ");  
		    current=current.next;
        }
		System.out.println();
	}
	
	public void reversedisplay()
	{  
		Node current=tail;  
			
		if(tail==null)
		{  
			System.out.println("List is empty");  
			return;
	    }
		System.out.println("Nodes of doubly linked list: ");  
			
		while(current!= null)
		{  
			System.out.print(current.rollno+" ");  
			current=current.prev;
		}
		System.out.println();
	}
	
	public void countNodes()
	{
		int count=0;
		if (tail==null)
		{
			System.out.println("Empty double linked list");
		}
		else
		{
			Node current=tail;
			while (current!=null)
			{
				count++;
				current=current.prev;
			}
			System.out.println("Number of nodes are "+count);
		}
	}

	public void search(int key)
	{
		Node current;
		int flag=0,pos=1;
		
		current=head;
		while (current!=null)
		{
			if (current.rollno==key)
			{
				flag=1;
				break;
			}
			current=current.next;
			pos++;
		}
		if (flag==1)
		{
			System.out.println("Element found in the linked list at "
		+pos+" position");
		}
		else
		{
			System.out.println("Element not found in the linked list");
		}
	}
	
	public static void main(String[] args)
	{  
		linkListClass dl = new linkListClass();  
		dl.display();
		dl.reversedisplay();
		
		dl.addNode(10);
		dl.addNode(35);
		dl.addNode(57);
		dl.addNode(24);
	
		dl.display();
		dl.reversedisplay();
				
		dl.addNodeAtStart(77);
		dl.display();
		
		dl.insert(57,92);
		dl.display();
		dl.reversedisplay();
		dl.countNodes();
		
		dl.search(57);
		dl.search(100);
	}  
}*/



/*public class linkListClass
{
	class Node
	{
		int rollno;
		Node next;
		public Node(int rollno)
		{
			this.rollno=rollno;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data)
	{
		Node newnode=new Node(data);
		
		if (head==null)
		{
			head=newnode;
			tail=newnode;
			newnode.next=head;
		}
		else
		{
			tail.next=newnode;
			
			tail=newnode;
			
			tail.next=head;
		}
	}
	
	public void insertNode(int key,int data)
	{
		int flag=0;
		Node current=head;
		Node newnode;
		do
		{
			if (current.rollno==key)
			{
				newnode=new Node(data);
				newnode.next=current.next;
				current.next=newnode;
				current=newnode;
				flag=1;
				break;
			}
			current=current.next;
		} while(current!=head);
		if (flag==0)
		{
			System.out.println("Node not found");
		}
	}
	public void display()
	{
		Node current=head;
		if (head==null)
		{
			System.out.println("Empty circular linked list");
		}
		else
		{
			System.out.println("Nodes of the circular linked list ");
			do
			{
				System.out.print(current.rollno+" ");
				current=current.next;
			} while (current!=head);
			System.out.println();
		}
	}
	
	public void countNodes()
	{
		int count=0;
		if (head==null)
		{
			System.out.println("Empty circular linked list");
		}
		else
		{
			Node current=head;
			do
			{
				count++;
				current=current.next;
			} while (current!=head);
			System.out.println("Number of nodes are "+count);
		}
	}
	
	public void search(int key)
	{
		int flag=0,pos=1;
		if (head==null)
		{
			System.out.println("Empty circular linked list");
		}
		else
		{
			Node current=head;
			do
			{
				if (current.rollno==key)
				{
					flag=1;
					break;
				}
				pos++;
				current=current.next;
			} while (current!=head);
			if (flag==1)
			{
				System.out.println("Element found at position "+pos);
			}
			else
			{
				System.out.println("Element not found");
			}
		}
	}
	
	public static void main(String[] args)
	{
		linkListClass cl=new linkListClass();
		cl.display();
		cl.addNode(21);
		cl.addNode(15);
		cl.addNode(48);
		cl.addNode(39);
			
		cl.display();
		cl.countNodes();
		cl.insertNode(3,100);
		cl.display();
		cl.countNodes();
		cl.search(48);
		cl.search(75);
	}
}*/



/*public class linkListClass {
    class Node {
        int rollno;
        Node next;

        public Node(int rollno) {
            this.rollno = rollno;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = newnode;
            newnode.next = head;
        } else {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }

    public void swapHeadAndTail() {
        if (head == null || head == tail) {
            return;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        tail.next = head.next;
        current.next = head;
        Node temp = head;
        head = tail;
        tail = temp;
        tail.next = head;
    }

    public void insertNode(int key, int data) {
        int flag = 0;
        Node current = head;
        Node newnode;
        do {
            if (current.rollno == key) {
                newnode = new Node(data);
                newnode.next = current.next;
                current.next = newnode;
                current = newnode;
                flag = 1;
                break;
            }
            current = current.next;
        } while (current != head);
        if (flag == 0) {
            System.out.println("Node not found");
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty circular linked list");
        } else {
            System.out.println("Nodes of the circular linked list:");
            do {
                System.out.print(current.rollno + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public void countNodes() {
        int count = 0;
        if (head == null) {
            System.out.println("Empty circular linked list");
        } else {
            Node current = head;
            do {
                count++;
                current = current.next;
            } while (current != head);
            System.out.println("Number of nodes are " + count);
        }
    }

    public void search(int key) {
        int flag = 0, pos = 1;
        if (head == null) {
            System.out.println("Empty circular linked list");
        } else {
            Node current = head;
            do {
                if (current.rollno == key) {
                    flag = 1;
                    break;
                }
                pos++;
                current = current.next;
            } while (current != head);
            if (flag == 1) {
                System.out.println("Element found at position " + pos);
            } else {
                System.out.println("Element not found");
            }
        }
    }

    public static void main(String[] args) {
        linkListClass cl = new linkListClass();
        cl.display();
        cl.addNode(21);
        cl.addNode(15);
        cl.addNode(48);
        cl.addNode(39);

        cl.display();
        cl.countNodes();

        System.out.println("Swapping head and tail...");
        cl.swapHeadAndTail();
        cl.display();

        cl.insertNode(15, 100);
        cl.display();
        cl.countNodes();
        cl.search(48);
        cl.search(75);
    }
}*/

/*import java.util.Stack;

public class linkListClass{
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("Stack size is: "+st.size());
        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
        }
        System.out.println("Stack size after pop is: "+st.size());
    }
}*/



/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkListClass{
    Node head;
    void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.println("Null");
    }
    public static void main(String args[]){
        linkListClass ll=new linkListClass();
        ll.head=new Node(10);
        ll.head.next=new Node(20);
        ll.head.next.next=new Node(20);
        ll.traverse();
    }
}*/



/*class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkListClass{
    Node head;
    void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.print("Null");
    }
    void addHead(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String args[]){
        linkListClass ll=new linkListClass();
        ll.traverse();
        System.out.println();
        ll.head=new Node(10);
        ll.head.next=new Node(20);
        ll.head.next.next=new Node(30);
        ll.traverse();
        System.out.println();
        ll.addHead(0);
        ll.traverse();
    }
}*/




/*class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;
    }
}
public class linkListClass{
    Node head;
    void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }System.out.print("Null");
    }

    void addAtStart(String newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }

    void addAtLast(String newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp=newNode;
    }

    void addAtPosition(String newData, int position){
        Node newNode=new Node(newData);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
    }
    public static void main(String args[]){
        linkListClass ll=new linkListClass();
        ll.traverse();System.out.println();
        ll.head=new Node("Salil ");
        ll.head.next=new Node("Thakur");
        ll.traverse();System.out.println();
        ll.addAtStart("Mr. ");
        ll.traverse();
        ll.addAtLast("!!!!");
        ll.traverse();
    }
}*/