/*public class Exception {
    public static void main(String args[]){
        int a=10,b=0;
        int c=a/b;
        System.out.println("result= "+c);
    }
}*/


/*class Exception{
    public static void main(String args[]){
        int a=10,b=0;
        try {
            int c=a/b;
            System.out.println("result: "+c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        finally{
            System.out.println("Program has been executed!");
        }
    }
}*/



/*class Exception{
    public static void main(String args[]){
        int arr[]= {1,2,3,4};
        try{
            for(int i=0;i<5;i++){
            System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to access element at invalid index");
        }finally{
            System.out.println("Coming out of try block");
        }
        
    }
}*/



/*import java.io.*;
class Exception{
    public static void main(String args[]) throws IOException{
        String root=System.getProperty("user.dir");
        System.out.println("Current root directory: "+root);

        String path=root+"\\abc.txt";
        System.out.println("File path: "+path);

        try {
            FileReader f=new FileReader(path);
            BufferedReader br= new BufferedReader(f);

            for(int counter=0;counter<3;counter++)
            System.out.println(br.readLine());
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+e.getMessage());
        }catch(IOException e){
            System.out.println("AN I/O error occured: "+e.getMessage());
        }
    }
}*/



/*import java.io.*;
class Exception{
    public static void main(String[] args) throws IOException {
        String r=System.getProperty("user.dir");
        System.out.println("Current root directory: "+r);

        String p=r+"\\abc.txt";
        System.out.println("Path  of the file: "+p);

        try {
            FileReader fr=new FileReader(p);
            BufferedReader br=new BufferedReader(fr);

            for(int i=0;i<5;i++)
            System.out.println(br.readLine());
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()+" file not found!!");
        }catch (IOException e){
            System.out.println("IO exception is being handled!!");
        }
    }
}*/



/*import java.io.*;

class Exception {
    public static void main(String[] args) throws IOException {
        String fn = "output.txt";
        String c = "hi";

        FileWriter writer = new FileWriter(fn);
        writer.write(c);
        writer.close();
        System.out.println("done! " + fn);
    }
}*/



/*import java.io.*;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        try {
            FileWriter writer = new FileWriter("output.txt");
            System.out.println("Enter names (enter '0' to stop):");
            while (true) {
                System.out.print("Enter name: ");
                name = sc.nextLine();
                if (name.equals("0")) {
                    break;
                }
                writer.write(name + "\n");
            }
            writer.close();
            System.out.println("Check output.txt!!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/



/*class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String m){
        super(m);
    }
}
class Exception{
    public static void divide(int a, int b){
        if(b==0){
            throw new DivideByZeroException("Division by zero is not allowed!!");
        }
        System.out.println("Result: "+(a/b));
    }
    public static void main(String args[]){
        try {
            divide(10, 1);
        } catch (DivideByZeroException e) {
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}*/



/*import java.util.Scanner;
class notZero extends RuntimeException{
    public notZero(String s){
        super(s);
    }
}
class Exception{
    public static void emi(float amount, float months){
        if(months==0){
            throw new notZero("Months cannot be Zero!!");
        }
        System.out.println("EMI: "+(amount/months));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Float a=sc.nextFloat();
        Float m=sc.nextFloat();
        try {
            emi(a, m);
        } catch (notZero e) {
        System.out.println("Exception caught: "+e.getMessage());
        }
    }
}*/



/*class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}

public class Excep {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 20) {
            throw new InvalidAgeException("Age is not Valid!!");
        }
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        try {
            validate(0);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}*/