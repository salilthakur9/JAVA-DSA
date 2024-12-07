//1
/*package DSA;
import java.util.Scanner;
public class Recursion{
    public static void recursion(int i,int n){
            if(i>n)return;
            System.out.println("Salil");
            recursion(i+1, n);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            recursion(1,n);
    }
}*/

//2
/*import java.util.Scanner;
public class Recursion{
    public static void recursion(int i,int n){
        if(i>n)return;
        System.out.println(i);
        recursion(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        recursion(1,n);
    }
}*/

//3
/*import java.util.*;
public class Recursion{
    public static void recursion(int n){
        if(n==0)return;
        System.out.println(n);
        recursion(n-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        recursion(n);
    }
}*/

//4
/*import java.util.Scanner;
public class Recursion{
    public static void recursion(int n,int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
        recursion(n-1, sum+n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        recursion(n, 0);
    }
}*/

//5
/*import java.util.*;
public class Recursion{
    public static int recursion(int n){
        if(n==0)return 0;
        return n+recursion(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(recursion(n));
    }
}*/


//6
/*import java.util.Scanner;
public class Recursion{
    public static int sum(int n){
        if(n==0)return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num));
    }
}*/


//7
/*import java.util.Scanner;
public class Recursion{
    public static int fact(int n){
        if(n==1)return 1;
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));
    }
}*/