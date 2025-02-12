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



/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("enter number 2: ");
        int num2=sc.nextInt();

        if(num1%2==0 && num2%2==0){
            System.out.println("both "+num1+" and "+num2+" is even!");
        }else if(num1%2==0 && num2%2!=0){
            System.out.println(num1+" is even but "+num2+" is odd!");
        }else if(num1%2!=0 && num2%2==0){
            System.out.println(num1+" is odd but "+num2+" is even!");
        }else{
            System.out.println("both "+num1+" and "+num2+" are odd!");
        }
    }
}*/


/*import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
        scanner.close();
    }
}*/



/*public class JavaBasics{
    public static void main(String[] args) {
        try {
            int number = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}*/



/*public class JavaBasics{
    public static void main(String args[]){
        int day=8;
        switch(day){
            case 1:System.out.println("MOnday");break;
            case 2:System.out.println("tuesday");break;
            case 3:System.out.println("wednesday");break;
            case 4:System.out.println("thrusday");break;
            case 5:System.out.println("friday");break;
            case 6:System.out.println("saturday");break;
            case 7:System.out.println("sunday");break;
            default:System.out.println("invalid input");
        }
    }
}*/



/*public class JavaBasics{
    public static void main(String args[]){
        int day=1;
        String dayName=switch(day){
            case 1->"monday";
            case 2->"tuesday";
            case 3->"wednesday";
            case 4->"thrusday";
            case 5->"friday";
            case 6->"saturday";
            case 7->"sunday";
            default->"invalid";
        };
        System.out.println(dayName);
    }
}*/


/*public class JavaBasics{
    public static void main(String args[]){
        for(int i=0;i<=10;i++){
            System.out.println("this is "+i+" iterations");
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(num==0){
            System.out.println("Zero");
        }else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (Integer.signum(number)) {
            case 1:
                System.out.println("The number is positive.");
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
            default:
                System.out.println("Unexpected value.");
        }
    }
}*/



/*public class JavaBasics{
    public static void main(String args[]){
        int[] number={1,2,3,4,5};
        System.out.println("Using for-each loop: ");
        for(int num:number){
            System.out.println("Number: "+num);
        }
    }
}*/



/*public class JavaBasics{
    public static void main(String args[]){
        int[] number={1,10,100,1000,10000,100000};
        int sum=0;
        System.out.println("Using for-each-loop:");
        for(int num:number){
            sum+=num;
        }System.out.println("Sum of the given array is: "+sum);
    }
}*/



/*public class JavaBasics {
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=2;j++){
                System.out.println("i= "+i+" j= "+j);
            }
        }
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(number + " x " + j + " = " + (number * j));
            }
            System.out.println();
        }
    }
}*/


/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the int value of marks obtained in five subjects: ");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();

        int percentage=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.print("Your percentage is: "+percentage);
        System.out.println();

        if(percentage>=80)System.out.println("A grade");
        else if(70<=percentage && percentage>=79)System.out.println("B Grade");
        else if(60<=percentage && percentage>=69)System.out.println("C Grade");
        else if(50<=percentage && percentage>=59)System.out.println("D Grade");
        else{System.out.println("F Grade");}
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your income: ");
        float income=sc.nextFloat();
        System.out.println();

        float tax_income=income-250000;
        System.out.print("Taxable Income: "+tax_income);
        System.out.println();

        if(tax_income<=250000)System.out.println("No Tax");
        else if(tax_income>250000 && tax_income<=500000){float tax=(tax_income*5)/100;System.out.println("Tax to be paid: "+tax);}
        else if(tax_income>500000 && tax_income<=1000000){float tax=(tax_income*10)/100;System.out.println("Tax to be paid: "+tax);}
        else if(tax_income>1000000 && tax_income<=1500000){float tax=(tax_income*20)/100;System.out.println("Tax to be paid: "+tax);}
        else{float tax=(tax_income*30)/100;System.out.println("Tax to be paid: "+tax);}
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];

        System.out.println("Enter the number of elements you want to enter:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.print("sum: "+sum);
    }
}*/




/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float f=sc.nextFloat();
        float ff=4.5f;
        float fff=(float)4.0;

        float ffff=f+ff+fff;
        System.out.println(ffff);
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        float num1=sc.nextFloat();
        System.out.print("Enter an Operator (+,-,*,/,%): ");
        char c=sc.next().charAt(0);
        System.out.print("Enter Number 2: ");
        float num2=sc.nextFloat();

        switch (c) {
            case '+':System.out.println(num1+" + "+num2+" = "+(num1+num2));break;
            case '-':System.out.println(num1+" - "+num2+" = "+(num1-num2));break;
            case '*':System.out.println(num1+" * "+num2+" = "+(num1*num2));break;
            case '/':System.out.println(num1+" / "+num2+" = "+(num1/num2));break;
            case '%':System.out.println(num1+" % "+num2+" = "+(num1%num2));break;
            default: break;
        }
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int month=sc.nextInt();

        String season;
        season= switch (month) {
            case 11, 12, 1, 2 -> "Winter";
            case 3, 4, 5, 6 -> "Summer";
            case 7, 8, 9, 10 -> "Rainy";
            default -> "Invalid input month";
        };

        System.out.println("Season: "+season);
    }
}*/


/*class JavaBasics{
    public static void main(String args[]){
        int [][] arrays ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        System.out.println("2d array elements: ");
        for(int i=0;i<arrays[i].length;i++){
            for(int j=0;j<arrays[i].length;j++){
                System.out.println(arrays[i][j]+"");
            }
            System.out.println();
        }
    }
}*/



/*public class JavaBasics {
    public static void main(String[] args) {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        };

        int rows = matrix.length;       
        int cols = matrix[0].length;     

        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0; 
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}*/



// Base class
/*class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

// Derived class
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount myAccount = new SavingsAccount("123456789", 1000.0, 5.0);

        // Display account details
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Perform some transactions
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.addInterest();

        // Display final balance
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}*/



/*import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a number: ");
        int number= sc.nextInt();
        
        int numberOfDigits= 0,sumOfDigits= 0,reverseNumber= 0;
        String evenDigits="",oddDigits="";
        
        while (number != 0) {
            int digit= number%10;
            numberOfDigits++;
            sumOfDigits+= digit;
            reverseNumber=reverseNumber*10+digit;

            if (digit%2==0)evenDigits+=digit+" ";
            else oddDigits +=digit+" ";
            number/=10;
        }
        System.out.println("number of digits: "+numberOfDigits);
        System.out.println("sum of digits: "+sumOfDigits);
        System.out.println("reverse of the number: "+reverseNumber);
        System.out.println("even digits: "+evenDigits);
        System.out.println("odd digits: "+oddDigits);
        sc.close();
    }
}*/


/*import java.util.Scanner;
public class JavaBasics {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = countDigits(number);
        while (number != 0) {
            int digit= number%10;
            sum+= power(digit,numberOfDigits);
            number/= 10;
        }
        return sum== originalNumber;
    }
    public static int calculateDecodedNumber(int number, boolean isArmstrong) {
        int decodedNumber = 0;
        int position = 1;
        
        while (number != 0) {
            int digit = number % 10;
            
            if (isArmstrong) {
                if (position % 2 == 0) {
                    decodedNumber += digit;
                }
            } else {
                if (position % 2 != 0) {
                    decodedNumber += digit;
                }
            }
            number /= 10;
            position++;
        }return decodedNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the encoded number: ");
        int number = sc.nextInt();
        
        boolean isArmstrong = isArmstrongNumber(number);
        int decodedNumber = calculateDecodedNumber(number, isArmstrong);
        
        System.out.println("Decoded number: " + decodedNumber);
        sc.close();
    }
}*/



/*public class JavaBasics{
    public static void new_pair(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+", "+num[j]+") ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7,8,9,10};
        new_pair(num);
    }
}*/



/*public class JavaBasics {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {11, 12, 13},
                {14, 15, 16}
            },
            {
                {07, 8, 9},
                {010, 011, 012}
            }
        };

        for (int i = 0; i < array.length; i++) { 
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < array[i].length; j++) { 
                for (int k = 0; k < array[i][j].length; k++) { 
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}*/



// write a program to find the maximum value in a 3D array:
/*public class JavaBasics {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };
        int max = Integer.MIN_VALUE;

        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int value : row) {
                    if (value > max) {
                        max = value;
                    }
                }
            }
        }
        System.out.println("Maximum value in the 3D array: " + max);
    }
}*/



// Write a program to calculate the sum of all elements in a 3D array:
/*public class JavaBasics {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };

        int sum = 0;

        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int value : row) {
                    sum += value;
                }
            }
        }
        System.out.println("Sum of all elements in the 3D array: " + sum);
    }
}*/



// Write a program to count how many elements in a 3D array are greater than a given value x:
/*import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        int[][][] array = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for X: ");
        int x = scanner.nextInt();

        int count = 0;

        for (int[][] layer : array) {
            for (int[] row : layer) {
                for (int value : row) {
                    if (value > x) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Number of elements greater than " + x + ": " + count);
    }
}*/


//write a code that takes input of the number of elements of array then take input from the user of each element then print it together in brackets.
/*import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1){
                System.out.print(", ");
            }
        }System.out.print("]");
    }
}*/


//Subarrays
/*import java.util.*;
public class JavaBasics{
    public static void printSubarrays(int number[]){
        int total_sub_arrays=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                total_sub_arrays++;
                System.out.println();
            }System.out.println();
        }System.out.println("num of sub arrays: "+total_sub_arrays);
    }
    public static void main(String args[]){
        int number[]={2, 3, 4, 5, 6, 7};
        printSubarrays(number);
    }
}*/



//sum of subarrys
/*import java.util.*;
public class JavaBasics{
    public static void SubArraySum(int[] number){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                curr_sum=0;
                for(int k=start;k<=end;k++){
                    curr_sum+=number[k];
                }System.out.println(curr_sum);
                if(curr_sum>max_sum){
                    max_sum= curr_sum;
                }
            }
        }
        System.out.println("max sum: "+max_sum);
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4};
        SubArraySum(number);
    }
}*/



// Array methods to insert:
/*import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null; 
        int size = 0; 

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Create an array");
            System.out.println("2. Show array data");
            System.out.println("3. Insert an element at the end of the array");
            System.out.println("4. Insert an element at the beginning of the array");
            System.out.println("5. Insert an element at a specific position");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size = scanner.nextInt();
                    array = new int[size];
                    System.out.println("Enter " + size + " elements for the array:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.println("Array created successfully!");
                    break;

                case 2:
                    if (array == null) {
                        System.out.println("No array exists!");
                    } else {
                        System.out.println("Array elements:");
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (array == null) {
                        System.out.println("No array exists!");
                    } else {
                        System.out.print("Enter the element: ");
                        int newElement = scanner.nextInt();
                        int[] newArray = new int[size + 1];
                        for (int i = 0; i < size; i++) {
                            newArray[i] = array[i];
                        }
                        newArray[size] = newElement;
                        array = newArray;
                        size++;
                        System.out.println("Element inserted!");
                    }
                    break;

                case 4:
                    if (array == null) {
                        System.out.println("No array exists!");
                    } else {
                        System.out.print("Enter the element: ");
                        int newElement = scanner.nextInt();
                        int[] newArray = new int[size + 1];
                        newArray[0] = newElement;
                        for (int i = 0; i < size; i++) {
                            newArray[i + 1] = array[i];
                        }
                        array = newArray;
                        size++;
                        System.out.println("Element inserted at the beginning!");
                    }
                    break;

                case 5:
                    if (array == null) {
                        System.out.println("No array exists!");
                    } else {
                        System.out.print("Enter the position (0-based index): ");
                        int position = scanner.nextInt();
                        if (position < 0 || position > size) {
                            System.out.println("Invalid position!");
                        } else {
                            System.out.print("Enter the element: ");
                            int newElement = scanner.nextInt();
                            int[] newArray = new int[size + 1];
                            for (int i = 0; i < position; i++) {
                                newArray[i] = array[i];
                            }
                            newArray[position] = newElement;
                            for (int i = position; i < size; i++) {
                                newArray[i + 1] = array[i];
                            }
                            array = newArray;
                            size++;
                            System.out.println("Element inserted at position " + position + "!");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting program!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }
}*/



/*import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }sc.close();
    }
}*/



/*import java.util.Scanner;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}*/



/*import java.util.Scanner;
class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        
        matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }
    }
}
public class JavaBasics {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.input();
        matrix.display();
    }
}*/



/*import java.util.Scanner;
class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            } System.out.println();
        }
    }

    public void transpose() {
        int[][] transposedMatrix = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }matrix = transposedMatrix;
        
        int temp = rows;
        rows = cols;
        cols = temp;
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.input();
        matrix.display();
        
        matrix.transpose();
        System.out.println("The transposed matrix is:");
        matrix.display();
    }
}*/




/*import java.util.Scanner;
class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        
        matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void display() {
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void rotate90Degrees() {
        int[][] rotatedMatrix = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }
        
        matrix = rotatedMatrix;
        
        int temp = rows;
        rows = cols;
        cols = temp;
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.input();
        matrix.display();
        
        matrix.rotate90Degrees();
        System.out.println("The matrix rotated by 90 degrees is:");
    }
}*/



/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        int n,i,j,temp,low,high,mid,flag=0;
        System.out.println("Enter the array size: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter the ["+i+"] element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter  the target element: ");
        int key=sc.nextInt();

        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        low=0;
        high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Elements found at "+(mid+1)+" position");
                flag=1;
                break;
            }else{
                if(arr[mid]<key){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        if(flag==0){
            System.out.println("elements not found!");
        }
    }
}*/




/*import java.util.Scanner;
class JavaBasics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=5;
        int arr[] = new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        } 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}*/

//<<<<<<<<<<<<<---------------------------------------------------------------------------->>>>>>>>>>>>>>>>>>>>

//1.  consider an employee management system where we need to duplicate an employee details (eg. for a new projedct assignment) without modifying 
//the original records


/*class Employee {
    String name;
    int age;
    String department;

    Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to create a duplicate employee
    Employee copy() {
        return new Employee(name, age, department);
    }

    void display() {
        System.out.println(name + " | " + age + " | " + department);
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 30, "Engineering");
        System.out.println("Original Employee:");
        emp1.display();

        Employee emp2 = emp1.copy(); 
        emp2.name = "Jane Smith";  
        emp2.age = 28;
        emp2.department = "Marketing";

        System.out.println("\nDuplicated (Modified) Employee:");
        emp2.display();

        System.out.println("\nOriginal Employee After Modification:");
        emp1.display(); 
    }
}*/



//2.  consider an employee management system, where an employess details need to be duplicate for a new project assignment. the duplicated records
// shpuld have the same details but any modifications to the new record should not affect the original implement deep copy to achive this.


/*class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee copy() {
        return new Employee(this.name, this.age, this.department);
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setDepartment(String department) { this.department = department; }
}

public class JavaBasics {
    public static void main(String[] args) {
        Employee original = new Employee("John Doe", 30, "Engineering");
        System.out.println("Original Employee:");
        original.display();

        Employee duplicate = original.copy();

        duplicate.setName("Jane Smith");
        duplicate.setAge(28);
        duplicate.setDepartment("Marketing");

        System.out.println("\nDuplicated (Modified) Employee:");
        duplicate.display();

        System.out.println("\nOriginal Employee After Modification:");
        original.display();
    }
}*/


// A library management system need to track multiple copies of the same book. if a shallow copy is used changes in one should reflect in all other copies.
// Demonstrate a shallow copy issue using java

/*class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class LibraryBook {
    Book book; 
    int copyNumber;

    public LibraryBook(Book book, int copyNumber) {
        this.book = book;  
        this.copyNumber = copyNumber;
    }

    public void display() {
        System.out.println("Copy " + copyNumber + " -> " + "Title: " + book.title + ", Author: " + book.author);
    }
}

public class JavaBasics {
    public static void main(String[] args) {
        Book originalBook = new Book("Java Programming", "James Gosling");

        LibraryBook copy1 = new LibraryBook(originalBook, 1);
        LibraryBook copy2 = new LibraryBook(originalBook, 2);

        System.out.println("Before Modification:");
        copy1.display();
        copy2.display();

        copy1.book.title = "Advanced Java";  

        System.out.println("\nAfter Modification:");
        copy1.display();
        copy2.display(); 
    }
}*/



// In a multiplayer game each player can have multiple weapons. if a shallow copy i used updating one player's weapon will modify all other using the same
// refernce. Demonstrate this issue using shallow copy.


