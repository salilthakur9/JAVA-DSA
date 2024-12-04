/*public class JavaBasics {
    public static void main(String[]args){
        System.out.print("Salil Thakur\n");
        System.out.println("Salil Thakur");
    }
}   */

/*public class JavaBasics{
    public static void main(String[]args){
        int a= 50;
        int b=10;
        System.out.println(a);
        System.out.println(b);
        String name= "Salil Thakur";
        System.out.println(name);
        a=b;
        System.out.println(a);
    }
}*/

/*import java.util.*;
public class JavaBasics{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int age = sc.nextInt();
    float salary = sc.nextFloat();
    System.out.println(input);
    System.out.println(age);
    System.out.println(salary);
}
}*/

/*import java.util.*;
public class JavaBasics{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
    }
}*/

/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float product = a/b;
        System.out.println(product);
    }
}*/

/*public class JavaBasics{
    public static void main(String args[]){
        float a= 16.09f;
        int b= (int) a;
        System.out.println(b);
    }
}*/

/*public class JavaBasics{
    public static void main(String args[]){
        char ch='s';
        int num=ch;
        System.out.println(num);
    }
}*/

/*public class JavaBasics{
    public static void main(String args[]){
        char a='a';
        char b='b';
        System.out.println(a-b);  
    }
}*/

/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible cause your age is "+age);
        }else{
            System.out.println("You are not eligible cause your age is "+age);
        }
    }
}*/

/*import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("ZERO");
        } else {
            if (num < 0) {
                System.out.println("NEGATIVE");
            } else {
                if (num % 2 == 0) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }
            }
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num1 = s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1+" is the largest");
        }else if(num2>=1 && num2>=num3){
            System.out.println(num2+" is the largest");
        }else{
            System.out.println(num3+" is the largest");
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();

        String type =(age>=18)? "yes eligible":"no not eligible";
        System.out.println(type);
    }
}*/


/*public class JavaBasics{
    public static void main(String args[]){
        int number=10;
        switch(number){
            case 10:System.out.println("10");break;
            case 20:System.out.println("20");break;
            default:System.out.println("def");
        }
    }
}*/


/*public class JavaBasics{
    public static void main(String args[]){
        int counter=1;
        while(counter<=10){
            System.out.println(counter+". hi");
            counter++;
        }
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int num=0;
        while(num!=n){
            num++;
            sum+=num;
        }
        System.out.println(sum);
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int sum=a+b;
        System.out.println(sum);
        sc.close();
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int counter=1;
        do{
            System.out.println("Salil");
            counter++;
        }while(counter<=n);
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);

        int number = sc.nextInt();

        boolean isP = true;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                isP=false;
            }
        }
        if(isP==true){
            System.out.println(number+" is prime!");
        }else{
            System.out.println(number+" is not prime!");
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void Print_name(){
        System.out.println("Salil Thakur");
    }
    public static void main(String args[]){
        Print_name();
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static int calculation(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
    
        System.out.println("sum of "+num1+" and "+num2+" is "+ calculation(num1,num2));
        sc.close();
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        System.out.println("sum of "+num1+" and "+num2+" is "+sum(num1,num2));
        System.out.println("sum of "+num1+", "+num2+" and "+num3+" is "+sum(num1,num2,num3));

        sc.close();
    }*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[100];

        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();

        System.out.println("{"+arr[0]+", "+arr[1]+", "+arr[2]+"}");

        sc.close();

    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void updation(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[50];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        updation(arr);
        System.out.println("square of each element: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/



/*import java.util.*;
public class JavaBasics{
    public static int findKey(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();

        int index=findKey(arr, key);
        if(index==-1){
            System.out.println("Key not found!");
        }else{
            System.out.println("key found at index "+index);
        }
        sc.close();
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        if(number<=0){
            System.out.println("zero and negative numbers are not allowed!");
        }else{
            if(number%2==0){
                System.out.println("number is divisible by 2 (even)");
            }else{
                System.out.println("number is not divisible by 2 (Odd)");
            }
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt(),num3=sc.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1+" is greatest!");
        }else if(num2>=num1 && num2>=num3){
            System.out.println(num2+" is greatest!");
        }else{
            System.out.println(num3+" is greatest!");
        }
        sc.close();
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void swapArray(int arr[]){
        int first=0,last=(arr.length)-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements u want to fill: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        swapArray(arr);
        System.out.println("After reversing the given array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void SubArray(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total numbers of the subarrys are: "+total);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        SubArray(arr);
        sc.close();
    }
}*/