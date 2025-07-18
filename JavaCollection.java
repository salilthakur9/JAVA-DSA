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