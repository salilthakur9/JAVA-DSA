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



/*import java.util.Scanner;
class Student{
    String name;
    int rollno;
    Student(String n,int r){
        this.name=n;
        this.rollno=r;
    }
    Student(Student s){
        this.name=s.name;
        this.rollno=s.rollno;
    }
    void display(){
        System.out.println(name+", having "+rollno+" Roll number!");
    }
}
class classes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        int Rollno=sc.nextInt();

        Student st1=new Student(Name, Rollno);
        Student st2=new Student(st1);
        st1.display();
        st2.display();
        sc.close();
    }
}*/



/*class Dog{
    void eat(String food){
        System.out.println("Dog eats "+food);
    }
}
class Dog2 extends Dog{
    void bark(String sound){
        System.out.println("Dog sounds "+sound);
    }
}
class classes{
    public static void main(String args[]){
        Dog2 d2=new Dog2();
        d2.eat("chips");
        d2.bark("bhow bhow");
    }
}*/



/*class class1{
    String name;
    class1(String s){
        this.name=s;
        System.out.println("The name is: "+s);
    }
}
class class2 extends class1{
    int rollno;
    class2(int r,String s){
        super(s);
        this.rollno=r;
        System.out.println("The roll number is: "+r);
    }
}
class classes{
    public static void main(String args[]){
        class1 c1=new class1("Salil");
        class2 c2=new class2(10,"Thakur");
    }
}*/