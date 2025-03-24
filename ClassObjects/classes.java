/*public class classes{
    public static class car{
        String brand;
        int date;
    
        public void display(){
            System.out.println("This is car brand: "+brand);
            System.out.println("This is date: "+date);
        }
    }
    public static void main(String args[]){
        car c=new car();
        c.brand="abc";
        c.date=2025;

        c.display();
    }
}*/


/*import java.util.Scanner;
class student{
    String name;
    int rollno;
    char grade;

    void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Student's roll number: "+rollno);
        System.out.println("Grade Obtained: "+grade);
    }
}
public class classes{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of the student: ");
        String Name=sc.nextLine();
        System.out.println("enter roll number of the student: ");
        int Rollno=sc.nextInt();
        System.out.println("Enter the grade obtained: ");
        char Grade=sc.next().charAt(0);

        student st=new student();
        st.name=Name;
        st.rollno=Rollno;
        st.grade=Grade;
       
        st.display();

        sc.close();
    }
}*/



/*import java.util.Scanner;
class student{
    public String fname;
    private String lname;
    protected String FullName;

    student(String fn, String ln){
        this.fname=fn;
        this.lname=ln;
    }

    void display(){
        System.out.println("The frist name: "+fname);
        System.out.println("The last name: "+lname);
        System.out.println("The full name: "+fname+" "+lname);
    }
}
class classes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String FName=sc.nextLine();
        String LName=sc.nextLine();

        student st=new student(FName, LName);
        st.display();
        sc.close();
    }
}*/


