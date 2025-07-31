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


/*import java.util.Scanner;
import java.util.Arrays;
public class JavaBasics{
    public static void main(String args[]){
        int arr[]= {1,5,7,15,3,9,11,8};
        int key, low,flag=0,high,mid;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target: ");
        Scanner sc = new Scanner(System.in);
        key=sc.nextInt();

        low=0;
        high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element found at "+mid+" position: ");
                flag=0;
                break;
            }else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(flag==0){
            System.out.println("Element not found!");
        }
    }
}*/



/*import java.util.*;
public class JavaBasics {
    public static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1, last = -1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 5, 5, 7, 15, 3, 9, 11, 8};
        int result;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        result = findLast(arr, 5);
        System.out.println("Last Position is: " + result);
    }
}*/




/*import java.util.*;
public class JavaBasics{
    public static void selsort(int arr[]){
        int n,i,j,min,temp;
        n=arr.length;
        for(i=0;i<n-1;i++){
            min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={4,1,8,94,0,75,8,15};
        selsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/



/*import java.util.*;
public class JavaBasics{
    public static void sorted(int arr[]){
        int n,i,j,min,temp;
        n=arr.length;
        for(i=0;i<n-1;i++){
            min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
    }
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num_of_students=sc.nextInt();
        int arr[]=new int[num_of_students];
        for(int i=1;i<=num_of_students;i++){
            System.out.print("Enter marks of student "+i+": ");
            arr[i]=sc.nextInt();
        }
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/



/*import java.util.*;

public class JavaBasics {
    public static void sorted(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num_of_students = sc.nextInt();
        int arr[] = new int[num_of_students];
        for (int i = 0; i < num_of_students; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sorted(arr);
        System.out.println("Sorted marks: " + Arrays.toString(arr));
        sc.close();
    }
}*/



/*import java.util.*;
public class JavaBasics{
    public static void insert(int arr[]){
        int n,i,j,temp;
        n=arr.length;
        for(i=1;i<n;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>=temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={4,3,78,34,2,10,66,0};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/



// display batsman scores in decending order using insertion sort and the scores should be put in the run time

/*import java.util.*;
public class JavaBasics {
    public static void sortedDescending(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of batsmen: ");
        int num_of_batsmen = sc.nextInt();
        int arr[] = new int[num_of_batsmen];
        for (int i = 0; i < num_of_batsmen; i++) {
            System.out.print("Enter score of batsman " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        sortedDescending(arr);
        System.out.println("Scores in descending order: " + Arrays.toString(arr));
        sc.close();
    }
}*/



/*import java.util.Scanner;
class JavaBasics{

    static void merge(int []arr, int lo, int mid , int hi){
        int an = mid-lo+1;
        int bn = hi - mid;

        int a[] = new int[an];
        int b[] = new int[bn];
        
        for(int i=0;i<an;i++){
            a[i] = arr[i+lo];
        }
        for(int i=0;i<bn;i++){
            b[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k = lo;
        while(i<an && j<bn){
            if(a[i]<b[j]){
                arr[k++] = a[i++];
            }    
            else{
                arr[k++] = b[j++];
            }
        }

        while(i<an){
            arr[k++] = a[i++];
        }
        while(j<bn){
            arr[k++] = b[j++];
        }

    }

    static void mergeSort(int [] arr , int lo, int hi){
        if(lo>=hi){
            return;
        }

        int mid = lo+(hi-lo)/2;

        mergeSort(arr, lo, mid);
        mergeSort(arr, mid+1, hi);
        merge(arr, lo, mid, hi);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements in the array : ");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        mergeSort(arr, 0, n-1);
        System.out.print("Sorted Array = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


/*import java.util.Scanner;

class JavaBasics {

    static void merge(int[] arr, int lo, int mid, int hi) {
        int an = mid - lo + 1;
        int bn = hi - mid;

        int[] a = new int[an];
        int[] b = new int[bn];

        for (int i = 0; i < an; i++) {
            a[i] = arr[i + lo];
        }
        for (int i = 0; i < bn; i++) {
            b[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = lo;
        while (i < an && j < bn) {
            if (a[i] > b[j]) { // Change comparison to '>' for descending order
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }

        while (i < an) {
            arr[k++] = a[i++];
        }
        while (j < bn) {
            arr[k++] = b[j++];
        }
    }

    static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of batsmen: ");
        int num_of_batsmen = in.nextInt();
        int[] arr = new int[num_of_batsmen];
        System.out.println("Enter the scores of the batsmen:");
        for (int i = 0; i < num_of_batsmen; i++) {
            System.out.print("Enter score of batsman " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }

        mergeSort(arr, 0, num_of_batsmen - 1);
        System.out.print("Scores in descending order: ");
        for (int i = 0; i < num_of_batsmen; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}*/




/*class JavaBasics {
    public int calculate(int a, int b, String operation) {
        switch (operation) {
            case "add":return a + b;
            case "subtract":return a - b;
            case "multiply":return a * b;
            case "divide":
                if (b != 0){return a / b;}
                else{throw new ArithmeticException("Division by zero is not allowed.");}
            default:throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }

    public double calculate(double a, double b){return a*b;}

    public int calculate(int a, int b, int c){return a+b+c;}

    public int calculate(String number1, String number2){
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        return a+b;
}
    public static void main(String[] args) {
        JavaBasics calculator = new JavaBasics();

        System.out.println("Addition: " + calculator.calculate(10, 5, "add"));
        System.out.println("Subtraction: " + calculator.calculate(10, 5, "subtract"));
        System.out.println("Multiplication: " + calculator.calculate(10, 5, "multiply"));
        System.out.println("Division: " + calculator.calculate(10, 5, "divide"));
        System.out.println("Product of doubles: " + calculator.calculate(5.5, 2.2));
        System.out.println("Sum of three integers: " + calculator.calculate(1, 2, 3));
        System.out.println("Sum of strings: " + calculator.calculate("10", "20"));
    }
}*/




/*class BankAccount {
    public double interestRate() {
        return 0.0;
    }
    public final double minimumBalance() {
        return 1000.0;
    }
}
class SavingsAccount extends BankAccount {
    @Override
    public double interestRate() {
        return 4.0;
    }
}
class FixedDeposit extends BankAccount {
    @Override
    public double interestRate() {
        return 6.5; 
    }
}
public class JavaBasics {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount fixedDeposit = new FixedDeposit();

        System.out.println("Savings Account Interest Rate: " + savings.interestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + fixedDeposit.interestRate() + "%");
        System.out.println("Minimum Balance: " + savings.minimumBalance());
    }
}*/



/*class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition of two integers: " + calculator.add(10, 20));

        System.out.println("Addition of three doubles: " + calculator.add(1.1, 2.2, 3.3));

        System.out.println("Addition of multiple integers: " + calculator.add(1, 2, 3, 4, 5));

        byte byteValue = 10;
        short shortValue = 20;
        System.out.println("Addition with type promotion (byte and short): " + calculator.add(byteValue, shortValue));
    }
}*/



// Structure of node in linked list
/*class Node{
    int rollno;
    Node next;
    Node (int rollno){
        this.rollno=rollno;
        this.next=null;
    }
}*/



/*import java.util.*;
public class JavaBasics {
    class Node {
        int rollno;
        Node next;

        Node(int rollno) {
            this.rollno = rollno;
            this.next = null;
        }
    }

    Node head = null;
    Node current;

    public void addNode(int roll) {
        Node newnode = new Node(roll);
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

    public void insert(int key, int data){
        Node newnode, current=head;
        int flag=0;
        while(current!=null){
            if(current.rollno==key){
                flag=1;
                newnode=new Node(data);
                newnode.next=current.next;
                current.next=newnode;
                current=newnode;
                break;
            }current=current.next;
        }if(flag==0){
            System.out.println("Node not found!");
        }
    }

    public void delete(int key){
        Node current,temp;
        current=head;
        int flag=0;
        if(current.rollno==key){
            head=current.next;
        }else{
            temp=current.next;
            while(temp!=null){
                if(temp.rollno==key){
                    current.next=temp.next;
                    flag=1;
                    break;
                }current=temp;
                temp=temp.next;
            }if(flag==0){
                System.out.println("Node not found");
            }
        }
    }


    public static void main(String[] args) {
        JavaBasics list = new JavaBasics();
        list.display();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.insert(3, 10);
        list.delete(4);

        list.display();
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static int average(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        int avg=(total)/arr.length;
        return avg;
    }
    public static int highest(int arr[]){
        int high=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>high){
                high=num;
            }
        }return high;
    }
    public static int lowest(int arr[]){
        int low=Integer.MAX_VALUE;
        for(int num:arr){
            if(low>num){
                low=num;
            }
        }return low;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number marks u want to add: ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The avg marks here are: "+average(arr));
        System.out.println("The highest marks in the given are: "+highest(arr));
        System.out.println("The Lowest marks here are: "+lowest(arr));
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static int max_profit(int arr[]){
        int maxProfit=0, min=Integer.MAX_VALUE;
        for(int ar: arr){
            if(ar < min){
                min = ar;
            }else if(ar - min > maxProfit){
                maxProfit = ar - min;
            }
        }
        return maxProfit;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter " + N + " stock prices:");  
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The maximum profit is: " + max_profit(arr));
        sc.close();
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static int fiveStar(int arr[]){
        int count=0;
        for(int ar:arr){
            if(ar==5)count++;
        }return count;
    }
    public static int fourStar(int arr[]){
        int count=0;
        for(int ar:arr){
            if(ar==4)count++;
        }return count;
    }
    public static int threeStar(int arr[]){
        int count=0;
        for(int ar:arr){
            if(ar==3)count++;
        }return count;
    }
    public static int twoStar(int arr[]){
        int count=0;
        for(int ar:arr){
            if(ar==2)count++;
        }return count;
    }
    public static int oneStar(int arr[]){
        int count=0;
        for(int ar:arr){
            if(ar==1)count++;
        }return count;
    }
    public static int zeroStar(int arr[]){
        int count=0;
        for(int ar:arr){
            if(ar==0)count++;
        }return count;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int N=sc.nextInt();

        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("5 stars users: "+fiveStar(arr)+"\n");
        System.out.print("4 stars users: "+fourStar(arr)+"\n");
        System.out.print("3 stars users: "+threeStar(arr)+"\n");
        System.out.print("2 stars users: "+twoStar(arr)+"\n");
        System.out.print("1 stars users: "+oneStar(arr)+"\n");
        System.out.print("0 stars users: "+zeroStar(arr));
    }
}*/



/*public class JavaBasics{
    public static String winner(char[][] arr){
        for(int i=0;i<3;i++){
            if(arr[i][0]!='-' && arr[i][1]==arr[i][0] && arr[i][2]==arr[i][1])return "Winner "+arr[i][0];
            if(arr[0][i]!='-' && arr[1][i]==arr[0][i] && arr[2][i]==arr[1][i])return "Winner "+arr[0][i];
        }
        if(arr[0][0]!='-' && arr[1][1]==arr[0][0] && arr[2][2]==arr[1][1])return "Winner "+arr[0][0];
        if(arr[0][2]!='-' && arr[1][1]==arr[0][2] && arr[2][0]==arr[1][1])return "Winner "+arr[0][2];

    return "No Winner!";
    }
    public static void main(String args[]){
        char[][] arr={
            {'X','O','X'},
            {'O','O','O'},
            {'O','X','X'}
        };
        System.out.println(winner(arr));
    }
}*/



/*public class JavaBasics{
    public static void rotate(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-j-1];
                arr[i][arr.length-j-1]=temp;
            }
        }
    }
    public static void display(int[][] arr){
        for(int[] row:arr){
            for(int val:row){
                System.out.print(val+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(arr);
        display(arr);
    }
}*/



/*public class JavaBasics{
    public static int max_index(int[][] arr){
        int max_sum=0,maxIndex=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max_sum){
                max_sum=sum;
                maxIndex=i+1;
            }
        }return maxIndex;
    }
    public static void main(String args[]){
        int[][] arr={
            {10,20,30},
            {10,30,40},
            {100,10,20}
        };
        System.out.println("The maximax value is in the row: "+max_index(arr));
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static int max_index(int[][] arr){
        int max_sum=0,index=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[i][j];
            }if(sum>max_sum){
                max_sum=sum;
                index=i+1;
            }
        }return index;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols=sc.nextInt();

        int[][] arr=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("The maximum sum is in the row: "+max_index(arr));
    }
}*/


/*public class JavaBasics{
    public static void main(String args[]){
        String str="Salil";
        System.out.println(str);
        str=str.concat(" Thakur");
        System.out.println(str);
        System.out.println(str.replace("Thakur","THAKUR"));
    }
}*/


/*import java.util.StringTokenizer;
public class JavaBasics{
    public static void main(String args[]){
        StringTokenizer st=new StringTokenizer("Salil Thakur");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}*/



/*public class JavaBasics{
    public static void main(String args[]){
        String str="Salil Thakur";
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}*/



/*import java.util.Scanner;
public class JavaBasics{
    public static boolean check(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(check(str)){
            System.out.println("This is palindrome!");
        }else{
            System.out.println("This is not a palindrome!");
        }
    }
}*/



/*import java.util.Scanner;
import java.util.StringTokenizer;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        int count=0;
        while(st.hasMoreTokens()){
            st.nextToken();
            count++;
        }
        System.out.println(count+ " Words are there.");
    }
}*/




/*class BankAccount{
    private int balance=1000;
    void deposit(int amount){
        balance+=amount;
        System.out.println("The amount deposited! new balance: "+balance);
    }
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("insufficient balance!");
        }else{
        balance-=amount;
        System.out.println("The amount deducted! new balance is "+balance);
        }
    }
}
public class JavaBasics{
    public static void main(String args[]){
        BankAccount bk=new BankAccount();
        bk.deposit(500);
        bk.withdraw(500);
    }
}*/



/*import java.util.*;

// Patient class with basic information
class Patient {
    int id;
    String name;
    int age;
    String disease;

    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
    }
}

// Node for LinkedList
class Node {
    Patient patient;
    Node next;

    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }
}

// LinkedList to store patient records
class PatientList {
    Node head;

    // Create
    public void addPatient(Patient patient) {
        Node newNode = new Node(patient);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Patient added successfully.");
    }

    // Read
    public void displayPatients() {
        if (head == null) {
            System.out.println("No patients found.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.patient.display();
            temp = temp.next;
        }
    }

    // Update
    public void updatePatient(int id, String newName, int newAge, String newDisease) {
        Node temp = head;
        while (temp != null) {
            if (temp.patient.id == id) {
                temp.patient.name = newName;
                temp.patient.age = newAge;
                temp.patient.disease = newDisease;
                System.out.println("Patient updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Patient not found.");
    }

    // Delete
    public void deletePatient(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.patient.id == id) {
            head = head.next;
            System.out.println("Patient deleted.");
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.patient.id == id) {
                prev.next = curr.next;
                System.out.println("Patient deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Patient not found.");
    }

    // Search
    public void searchPatientByName(String name) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.patient.name.equalsIgnoreCase(name)) {
                temp.patient.display();
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Patient not found.");
    }

    // Sort (Bubble Sort)
    public void sortPatientsByName() {
        if (head == null || head.next == null)
            return;

        boolean swapped;
        do {
            swapped = false;
            Node temp = head;
            while (temp.next != null) {
                if (temp.patient.name.compareTo(temp.next.patient.name) > 0) {
                    Patient p = temp.patient;
                    temp.patient = temp.next.patient;
                    temp.next.patient = p;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);

        System.out.println("Patients sorted by name.");
    }
}

// Queue for appointment booking
class AppointmentQueue {
    Queue<Patient> appointments = new LinkedList<>();

    public void bookAppointment(Patient p) {
        appointments.add(p);
        System.out.println("Appointment booked for " + p.name);
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        for (Patient p : appointments) {
            p.display();
        }
    }
}

// Main class
public class JavaBasics {
    static Scanner sc = new Scanner(System.in);
    static PatientList patientList = new PatientList();
    static AppointmentQueue appointmentQueue = new AppointmentQueue();
    static int idCounter = 1;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Hospital Patient Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Search Patient by Name");
            System.out.println("6. Sort Patients by Name");
            System.out.println("7. Book Appointment");
            System.out.println("8. View Appointments");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    patientList.addPatient(new Patient(idCounter++, name, age, disease));
                }
                case 2 -> patientList.displayPatients();
                case 3 -> {
                    System.out.print("Enter Patient ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new disease: ");
                    String disease = sc.nextLine();
                    patientList.updatePatient(id, name, age, disease);
                }
                case 4 -> {
                    System.out.print("Enter Patient ID to delete: ");
                    int id = sc.nextInt();
                    patientList.deletePatient(id);
                }
                case 5 -> {
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    patientList.searchPatientByName(name);
                }
                case 6 -> patientList.sortPatientsByName();
                case 7 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    Patient p = new Patient(idCounter++, name, age, disease);
                    appointmentQueue.bookAppointment(p);
                }
                case 8 -> appointmentQueue.viewAppointments();
                case 9 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 9);
    }
}*/



/*import java.util.*;

// Book model
class Book {
    int id;
    String title, author;
    int quantity;
    int issuedCount;

    Book(int id, String title, String author, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.issuedCount = 0;
    }
}

// BST Node for sorted display
class BookBST {
    static class TreeNode {
        Book book;
        TreeNode left, right;

        TreeNode(Book book) {
            this.book = book;
        }
    }

    TreeNode root;

    void insert(Book book) {
        root = insertRec(root, book);
    }

    private TreeNode insertRec(TreeNode root, Book book) {
        if (root == null) return new TreeNode(book);
        if (book.id < root.book.id)
            root.left = insertRec(root.left, book);
        else if (book.id > root.book.id)
            root.right = insertRec(root.right, book);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("ID: " + root.book.id + ", Title: " + root.book.title +
                    ", Author: " + root.book.author + ", Quantity: " + root.book.quantity +
                    ", Issued: " + root.book.issuedCount);
            inorderRec(root.right);
        }
    }
}

// Main Library System
class Library {
    Map<Integer, Book> bookMap = new HashMap<>();
    BookBST bst = new BookBST();
    Stack<Book> returnStack = new Stack<>();

    void addBook(int id, String title, String author) {
        if (bookMap.containsKey(id)) {
            Book book = bookMap.get(id);
            book.quantity++;
            System.out.println("Book already exists. Increased quantity to " + book.quantity);
        } else {
            Book book = new Book(id, title, author, 1);
            bookMap.put(id, book);
            bst.insert(book);
            System.out.println("Book added.");
        }
    }

    void issueBook(int id) {
        try {
            if (!bookMap.containsKey(id)) throw new Exception("Book ID not found.");
            Book book = bookMap.get(id);
            if (book.quantity <= 0) throw new Exception("Book not available for issue.");
            book.quantity--;
            book.issuedCount++;
            System.out.println("Issued: " + book.title);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void returnBook(int id) {
        try {
            if (!bookMap.containsKey(id)) throw new Exception("Book ID not found.");
            Book book = bookMap.get(id);
            if (book.issuedCount <= 0) throw new Exception("No issued copy available to return.");
            book.quantity++;
            book.issuedCount--;
            returnStack.push(book);
            System.out.println("Returned: " + book.title);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void displayBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\nAll Books:");
            for (Book book : bookMap.values()) {
                System.out.println("ID: " + book.id + ", Title: " + book.title +
                        ", Author: " + book.author + ", Quantity: " + book.quantity +
                        ", Issued: " + book.issuedCount);
            }
        }
    }

    void searchBook(int id) {
        if (bookMap.containsKey(id)) {
            Book book = bookMap.get(id);
            System.out.println("Found: " + book.title + ", Quantity: " + book.quantity + ", Issued: " + book.issuedCount);
        } else {
            System.out.println("Book not found.");
        }
    }

    void showRecentlyReturned() {
        if (returnStack.isEmpty()) {
            System.out.println("No recent returns.");
        } else {
            Book book = returnStack.peek();
            System.out.println("Recently Returned: " + book.title + " (ID: " + book.id + ")");
        }
    }

    void displayBooksSorted() {
        System.out.println("\nBooks (Sorted by ID):");
        bst.inorder();
    }
}

// Main class
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Display Sorted Books");
            System.out.println("6. Search Book by ID");
            System.out.println("7. Show Recently Returned Book");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.next(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // clear buffer
                        System.out.print("Enter Book Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        lib.addBook(id, title, author);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please try again.");
                        sc.nextLine(); // clear buffer
                    }
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    lib.issueBook(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    lib.returnBook(sc.nextInt());
                    break;
                case 4:
                    lib.displayBooks();
                    break;
                case 5:
                    lib.displayBooksSorted();
                    break;
                case 6:
                    System.out.print("Enter Book ID to search: ");
                    lib.searchBook(sc.nextInt());
                    break;
                case 7:
                    lib.showRecentlyReturned();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}*/



/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("name1");
        al.add("name2");
        al.add("name3");
        al.add("name4");
        System.out.println(al);
        System.out.println("Size is: "+al.size());
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("name1");
        al.add("name2");
        al.add("name3");
        al.add("name4");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("name1");
        al.add("name2");
        al.add("name3");
        al.add("name4");
        System.out.println(al.contains("name1"));
        System.out.println(al.contains("name5"));
    }
}*/


/*import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();
        al.add("name4");
        al.add("name2");
        al.add("name3");
        al.add("name1");
        al.sort(null);
        System.out.println(al);
    }
}*/



/*import java.util.ArrayList;
public class JavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Before: " + numbers);

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }System.out.println("After: " + numbers);
    }
}*/



/*import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class JavaBasics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> n = new HashSet<>();

        System.out.println("Enter numbers (type 0 to stop):");

        while (true) {
            int num = scanner.nextInt();
            if (num==0)break;

            if (n.contains(num)){
                System.out.println("No Duplicates i.e. " + num);
            }else{
                n.add(num);
            }
        }System.out.println("Final: " + n);
        scanner.close();
    }
}*/



/*import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), i=0;
        for(; i<list.size();i++)
            if(list.get(i)==x)break;

        System.out.println(i < list.size() ? "Found at index: " + i : "Not found");
    }
}*/



/*import java.util.*;
public class JavaBasics{
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>();
        arr.add("xyz");
        arr.add("abc");
        arr.add("xyz");
        arr.add("abc");

        HashMap<String, Integer> freq=new HashMap<>();

        for(String e:arr){
            freq.put(e, freq.getOrDefault(e,0)+1);
        }

        for(Map.Entry<String, Integer> entry:freq.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}*/