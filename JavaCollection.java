//LIST

/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class JavaCollection {
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);
        list.add(1,20);
        System.out.println(list);

        List<Integer> newList= new ArrayList<>();
        newList.add(100);
        newList.add(200);
        System.out.println(newList);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(0));
        list.remove(5);
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        list.set(1, 1000);
        System.out.println(list);

        System.out.println(list.contains(1000));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(Integer element:list){
            System.out.println(element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
    }
}
*/



/*import java.util.*;
public class JavaCollection{
    public static void main(String args[]){
        List<Integer> new_list = new ArrayList();
        new_list.add(23);
        new_list.add(23);
        new_list.add(23);
        new_list.add(23);
        System.out.println("list: "+new_list);
    }
}*/




/*import java.util.*;
public class JavaCollection{
    public static void main(String args[]){
        Stack<String> names= new Stack<>();

        names.push("Salil");
        names.push("Thakur");
        names.push("Salil Thakur");

        System.out.println("Stack: "+names);

        System.out.println(names.peek());
        names.pop();
        System.out.println("Stack now: "+names);

        System.out.println(names.peek());
    }
}*/



/*import java.util.HashMap;
import java.util.Map;

public class JavaCollection{
    public static void main(String[] args) {
        Map<String, Integer> number = new HashMap<>();
        number.put("one", 1);
        number.put("one2", 2);
        number.put("one3", 1);
        number.put("one4", 1);

        System.out.println(number);
    }
}*/



/*interface Engine{
    void start();
}
class PetrolEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Petrol Engine Starting!!");
    }
}
class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Electric Engine Starting!!");
    }
}

class car{
    private Engine engine;
    public car(Engine engine){
        this.engine=engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}

public class JavaCollection{
    public static void main(String[] args) {
        Engine petroEngine=new PetrolEngine();
        car petrolCar=new car(petroEngine);
        petrolCar.drive();

        Engine electricEngine= new ElectricEngine();

        car electricar=new car(electricEngine);
        electricar.drive();
    }
}*/

/*import java.io.File;
import java.io.IOException;

public class JavaCollection{
    public static void main(String[] args) {
        try{
            File obj=new File("new.txt");
            if(obj.createNewFile()){
                System.out.println("File Created: "+obj.getName());
            }else{
                System.out.println("File already Exists!");
            }
        }catch(IOException e){
            System.out.println("An error has occured!");
            e.printStackTrace();
        }
    }
}*/



/*import java.io.FileWriter;
import java.io.IOException;

public class JavaCollection{
    public static void main(String[] args) {
        try{
            FileWriter Writer=new FileWriter("new.txt");
            Writer.write("bye-bye");
            Writer.close();
            System.out.println("Done!");
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}*/



/*import java.io.FileReader;
import java.io.IOException;

public class JavaCollection {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("new.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}*/



/*import java.io.File;

public class JavaCollection {
    public static void main(String[] args) {
        File file = new File("new.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}*/



/*import java.util.HashSet;
public class JavaCollection{
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("name1");
        hs.add("name2");
        hs.add("name2");

        System.out.println(hs);
        System.out.println();
        for(String h: hs){
            System.out.print(h);
        }
    }
}*/



/*class MyThread extends Thread{
    public void run(){
        System.out.println("Thread running using Thread class");
    }
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}*/




/*public class JavaCollection extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }System.out.println("Example: "+i);
        }
    }
    public static void main(String[] args) {
        JavaCollection t1=new JavaCollection();
        JavaCollection t2=new JavaCollection();
        JavaCollection t3=new JavaCollection();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}*/



/*class counter{
    private int c=0;
    public synchronized void inc(){
        c++;
    }
    public synchronized int get(){
        return c;
    }
}

public class JavaCollection{
    public static void main(String[] args) {
        counter cnt=new counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<100;i++){
                cnt.inc();
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                cnt.inc();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }System.out.println("Counter: "+cnt.get());
    }
}*/



/*import java.util.ArrayList;
import java.util.Collection;
public class JavaCollection{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        al.add(1);
        System.out.println(al);
        System.out.println(al.size());
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i)+" ");
        }
        al.remove(1);
        System.out.println(al);

        System.out.println(al.contains(2)); 
        
    }
}*/



/*import java.util.ArrayList;
public class JavaCollection{
    public static void main(String[] args) {
        int arr[]={100,103,105,101,103,105};
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println(al);
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }System.out.println(al);

        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i)+" ");
        }
    }
}*/


/*import java.util.ArrayList;
import java.util.LinkedHashSet;

public class JavaCollection {
    public static void main(String[] args) {
        int arr[] = {100, 103, 105, 101, 103, 105};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        
        System.out.println("Original ArrayList: " + al);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(al);
        al = new ArrayList<>(set);
        System.out.println("After removing duplicates: " + al);
    }
}*/



/*import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollection{
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
    }
}*/