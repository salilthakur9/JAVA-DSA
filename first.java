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



/*import java.util.Scanner;
import java.io.*;
class Excep{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name;
    try {
        FileWriter fw=new FileWriter("output.txt");
         System.out.println("Enter names (enter '0' to stop):");
            while (true) {
                System.out.print("Enter name: ");
                name = sc.nextLine();
                if (name.equals("0")) {
                    break;
                }
                StringBuilder sb= new StringBuilder(name);
                String new_name= sb.reverse().toString();
                if(name.equals(new_name)){
                    fw.write(name+" Palindrome" + "\n");
                }else{
                    fw.write(name+" Not Palindrome"+"\n");
                }
            }
            fw.close();
            System.out.println("Check output.txt!!");
    } catch (IOException e) {
        System.out.println("Esception Caught: "+e.getMessage());
    }finally{
        sc.close();
    }
}
}*/


/*import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue; // skip duplicates
            if (nums[i] == nums[i - 1] + 1) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }

        return Math.max(maxLen, currLen);
    }
}*/



/*interface ZeroParameter{
    void display();
}
public class Excep{
    public static void main(String args[]){
        ZeroParameter zp=()->System.out.println("hi");
        zp.display();
    }
}*/




/*interface OneParameter{
    void display(String str);
}
public class Excep{
    public static void main(String[] args) {
        OneParameter op=(name)->System.out.println("Hi"+name);
        op.display("Sir");
    }
}*/



// interface TwoParameter{
//     void maximum(int a,int b);
// }
// public class first{
//     public static void main(String[] args) {
//         TwoParameter op=(a,b)-> {
//             if(a>b) 
//             System.out.println("Greatest of two is:"+a); 
//             else 
//             System.out.println("Greatest of two is:"+b);
//         };
    
//         op.maximum(2,3);
//     }
// }








// interface TwoParameter{
//     void maximum(int a,int b,int c);
// }
// public class first{
//     public static void main(String[] args) {
//         TwoParameter op=(a,b,c)-> {
//             if(a>b && a>c) 
//             System.out.println("Greatest of three is:"+a); 
//             else if(b>a && b>c)
//             System.out.println("Greatest of three is:"+b);
//             else
//             System.out.println("Greatest of three is:"+c);
//         };
    
//         op.maximum(8,3,4);
//     }
// }









/*interface OneParameter{
    void display(String str);
}
public class first{
    public static void main(String[] args) {
        OneParameter op=(name)->{
            int count=0;
            for(int i=0;i<name.length();i++){
                count++;

            }
            System.out.println("Length of string is:"+count);
        };
        op.display("Shivansh");
    }
}*/



/*class first{
    public static void main(String args[]){
        new Thread(()->System.out.println("New thread created")).start();
    }
}*/



/*interface Square{
    int calculate(int x);
}
public class first{
    public static void main(String[] args) {
        int a=3;
        Square sq=(int x)->x*x;
        int ans=sq.calculate(a);
        System.out.println("Square of number is:"+ans);
    }
}*/



/*import java.util.*;
public class first{
    public static void main(String args[]){
        List<String> names=new ArrayList<>(Arrays.asList("Python","java","C"));
        names.forEach(name->System.out.println(name));
    }
}*/

/*import java.util.*;
public class first{
    public static void main(String args[]){
        List<String> names=new ArrayList<>(Arrays.asList("Python","java","C"));
        names.forEach(name->System.out.println(name.toUpperCase()));
    }
}*/



/*import java.util.*;
public class first{
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(Arrays.asList("Thakur", "Salil"));
        Collections.sort(names,(n1,n2)->n1.compareTo(n2));
        System.out.println("After sorting: "+names);
    }
}*/



/*import java.util.*;
public class first{
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Python","Java","React");
        names.sort((n1, n2)->n2.compareTo(n1));
        System.out.println("After Sorting "+names);
    }
}*/



/*@FunctionalInterface
interface rev {
    String reverse(String s);
}
public class first{
    public static void main(String args[]){
        rev f=(str)->{
            String result="";
            for(int i=str.length()-1;i>=0;i--)
            result+= str.charAt(i);
            return result;
        };
        System.out.println("Reverse: "+f.reverse("HII"));
    }
}*/



/*import java.util.*;
import java.util.stream.Collectors;
public class first{
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(9,52,27,43,4);
        List<Integer> even_num=num.stream().filter(number->number%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers: "+even_num);
    }
}*/



/*import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class first{
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("salil", "thakur");
        List<String> up_str=strings.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println("Even Numbers: "+up_str);
    }
}*/



/*import java.util.*;
import java.util.stream.Collectors;
public class first{
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<Integer>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);

        System.out.println("Marks of students before grace: "+marks);
        List<Integer> updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());

        System.out.println("Marks of students after grace: "+updatedmarks);
    }
}*/



/*class Base{
    void display(){
        System.out.println("Base Class");
    }
}
class Derived extends Base{
    void display(){
        System.out.println("Derived Class");
    }
}

public class first{
    public static void main(String[] args) {
        Derived d=new Derived();
        d.display();
    }
}*/



/*class Base{
    void display(){
        System.out.println("Base Class");
    }
}
class Derived extends Base{
    @Override
    void display(){
        System.out.println("Derived Class");
    }
}

public class first{
    public static void main(String[] args) {
        Derived d=new Derived();
        d.display();
    }
}*/



/*class first{
    @Deprecated
    int num=10;
    final int MAX_NUM=10;

    @Deprecated
    public void myMsg(){
        System.out.println("This is deprecated method!");
    }

    public void myMsg2(String msg, String msg2){
        System.out.println(msg+msg2);
    }

    public static void main(String args[]){
        first obj=new first();
        obj.myMsg();
        System.out.println(obj.num);
    }
}*/



/*import java.util.Date;
import java.time.LocalDate;
class first{
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.getDate());
        LocalDate dt=LocalDate.now();
        System.out.println(dt);
    }
}*/



/*import java.util.ArrayList;
public class first{
    @SuppressWarnings("unchecked")
    static void elementList(){
        ArrayList arr= new ArrayList<>();
        arr.add("Program");
        System.out.println("ArraysList: "+arr);
    }
    public static void main(String[] args) {
        elementList();
    }
}*/