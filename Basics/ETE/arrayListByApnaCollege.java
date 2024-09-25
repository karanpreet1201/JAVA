import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class arrayListByApnaCollege {
    public static void main(String[] args) {
        
        // Declartion 
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Adding elements 
        list.add(0);
        list.add(2);
        list.add(7);
        list.add(100);
        list.add(99);
        System.out.println(list);
        System.out.println();

        // Get list elements
        int element = list.get(2);
        System.out.println(element);

        // add element in between
        list.add(1,5);
        System.out.println(list);

        // Set element 
        list.set(0,9);
        System.out.println(list);


        // delete 
        list.remove(2);
        System.out.println(list);

        // Size 
        System.out.println(list.size());

        // loops
        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


        // Sort 
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);

        list.add(0);
        list.add(2);
        list.add(7);
        list.add(100);
        list.add(99);

        // list.toArray();
        // System.out.println(list);

        Object a[] = list.toArray();
        for (Object e:a)
        {
            Integer temp = (Integer) e;
            System.out.print(temp + " ");
        }
        



        // Iterate 

        System.out.println();
        System.out.println();
        System.out.println("ITERATE STARTS ..............");


        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Dragon Fruit");

        for (int i = 0 ; i < fruits.size() ; i++)
        {
            System.out.println("Fruit is : " + fruits.get(i));
        }

        for(String e : fruits)
        {
            System.out.println("For each Fruit : " + e);
        }

        Iterator<String> fi = fruits.iterator();
        while(fi.hasNext())
        {
            System.out.println(fi.next());
        }
        

    }
}
