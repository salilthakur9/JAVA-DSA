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