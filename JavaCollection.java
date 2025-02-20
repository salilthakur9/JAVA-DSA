import java.util.ArrayList;
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
