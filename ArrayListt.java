import java.util.*;

public class ArrayListt {
    public static void main(String[] args) {

        //Lists
        System.out.println("Hello, world!");
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int x=list.get(2);
        System.out.println("Element at index 2 is "+x);  //note we use + here
        //list . remove(index)
        //list .remove(object)
        //to remove a particular value use Integer.value of
        list.remove(Integer.valueOf(2));
        for(int x1: list)
            System.out.println(x1);


        //way 2
        ArrayList<Integer> list1 = new ArrayList<>(10);  //allocated memory of 10 elements,
//        System.out.println(list1.size());  ///its zero

        /*Array as list*/
        String[] arr = {"apple", "banana", "cherry"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list2); // [apple, banana, cherry]

        //its fix sized, we cant add or do list2.add()
        // way 3
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");


//        // Flexible, interface-based:
//        List<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//// ... later, switch if you find LinkedList is better:
//        names = new LinkedList<>(names); // rest of the code stays the same!
//
//// Concrete-only:
//        ArrayList<String> exactNames = new ArrayList<>();
//        exactNames.trimToSize(); // only ArrayList has this!

        //List<Integer> list1 = List.of(1, 2);: immutable
        //List<Integer> list1 = new ArrayList<>(List.of(1, 2));: mutable




    }
}
