package javaTutorial.CollectionsPractice.ListPractice;
import java.util.*;
public class ListPractice {

    public static void main(String[] args) {
        /**
         A list can store objects of any types. Primitive types are automatically converted to corresponding wrapper types, e.g. integer numbers are converted to Integer objects. It allows null and duplicate elements, and orders them by their insertion order (index).

         The List is the base interface for all list types, and the ArrayList and LinkedList classes are two common List’s implementations.
         ArrayList: An implementation that stores elements in a backing array. The array’s size will be automatically expanded if there isn’t enough room when adding new elements into the list. It’s possible to set the default size by specifying an initial capacity when creating a new ArrayList. Basically, an ArrayList offers constant time for the following operations: size, isEmpty, get, set, iterator, and listIterator; amortized constant time for the add operation; and linear time for other operations. Therefore, this implementation can be considered if we want fast, random access of the elements.
         LinkedList: An implementation that stores elements in a doubly-linked list data structure. It offers constant time for adding and removing elements at the end of the list; and linear time for operations at other positions in the list. Therefore, we can consider using a LinkedList if fast adding and removing elements at the end of the list is required.
         */
        /**
                  1.  list.add()
         */
//ArrayList
// list.add()
        //The following is a  example of creating a new ArrayList and LinkedList which hold String objects; add some elements to them; and then print out the collections:

      //  List<String> listWords = new ArrayList<String>();
        List <String> listString1 = new ArrayList<String>();
        listString1.add("Zeynab");
        listString1.add("Anar");
        listString1.add("Mahir");
        listString1.add("ZehraNur");
        listString1.add("Movlud");
        System.out.println("list "+listString1);

//LinkedList
//list.add()

        //    List<String> linkedWords = new LinkedList<String>();
        List <String> listString2 = new LinkedList<String>();
        listString2.add("Five");
        listString2.add("Six");
        listString2.add("Seven");
        listString2.add("Eight");
        System.out.println("listStrings "+listString2);


/**
    2
 declare a list instance with a generic type parameter, for example:
 */

        List<Object> listAnything = new ArrayList<Object>();
        listAnything.add(1);
        listAnything.add("word");
        listAnything.add('d');
        System.out.println("listAnything "+listAnything);


      //  List<Integer> listNumbers = new ArrayList<Integer>();
        List<Integer> listInteger1 = new ArrayList<Integer>();
        listInteger1.add(6);
        listInteger1.add(4);
        listInteger1.add(3);
        listInteger1.add(11);
        System.out.println(listInteger1);



        List <String> list23= new ArrayList<String>(Arrays.asList("apple","banana","kiwi"));
        System.out.println(listString2);

        /**
         3. Basic List operations: adding, retrieving, updating, removing elements
         */

        List<String> listStrings2 = new ArrayList<String>();
// OK to add Strings:
        listStrings2.add("One");
        listStrings2.add("Two");
        listStrings2.add("Three");
        //We can insert an element into the list at a specified index, for example:
        listStrings2.add(1,"Four");
        //We can also add all elements of an existing collection to the end of the list:
        listStrings2.addAll(listString1);

       //Or add the elements to the list at a specified position:
       listStrings2.addAll(2,list23) ;
// But this will cause compile error
    //    listStrings2.add(123);
        System.out.println(listStrings2);

        List <Number> listInteger = new ArrayList<>();
        listInteger.add(new Integer(123));
        listInteger.add(6);
        listInteger.add(new Float(5.8));
        listInteger.add(100.8);
        System.out.println(listInteger);


        /**
         Adding elements of sub types of the declared type:
         */

        List<Number> linkedNumbers = new LinkedList<Number>();
        linkedNumbers.add(4.3);
        linkedNumbers.add(new Integer(123));
        linkedNumbers.add(new Float(3.1415));
        linkedNumbers.add(new Double(299.988));
        linkedNumbers.add(new Long(67000));
        System.out.println(linkedNumbers);

/**
 Retrieving elements from a List
 The get() method is used to retrieve an element from the list at a specified index.
 */
        LinkedList<Number> numbers = new LinkedList<Number>(Arrays.asList(1,2,5,9,7,4,8.9,9008.87879));
        System.out.println(numbers);
        Number secondIndex = numbers.get(1);
        System.out.println(secondIndex);
//Note that the getFirst() and getLast() methods are specific to the LinkedList class.
        Number first = numbers.getFirst();
        Number last = numbers.getLast();

        System.out.println(first);
        System.out.println(last);

        /**
         Updating elements in a List
         Use the set(index, element) method to replace the element at the specified index by the specified element. For example:
         */

        List <Number> listNumber = new ArrayList<>(Arrays.asList(5,7,9,3));
        System.out.println(listNumber);
        Number num = listNumber.get(2);
        System.out.println(num);

        /**
         Updating elements in a List
         Use the set(index, element) method to replace the element at the specified index by the specified element. For example:
         */

        List <String> list3 = new ArrayList<>(Arrays.asList("Anar","Zeynab","Zehra","Movlud"));
        System.out.println(list3);
        list3.set(2,"nice");
        System.out.println(list3);

        /**
         Removing elements from a List
         To remove an element from the list, use the remove(index) or remove(Object) method which removes the element at the specified index or by object reference. For example:
         Remove the element at the 3rd position in the list:
         */

        List <String> list4 = new ArrayList<>(Arrays.asList("Tom","Jerry","Fox","Rabbit"));
        System.out.println(list4);
        list4.remove(1);
        System.out.println(list4);
        list4.clear();
        System.out.println(list4);

        /**
         4. Iterating over elements in a list
         Basically, we can use the enhanced for loop to iterate through all elements in the list, as follows:
         */

        List <String> list5 = new ArrayList<>(Arrays.asList("Sunny","Windy","Cold"));

        Iterator <String> iterator = list5.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         5. Searching for an element in a list
         To search for position of a specific element in the list or to know if the list contains the specified element, the following methods can be used:
         boolean contains(Object): returns trueif the list contains the specified element.
         int indexOf(Object): returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
         int lastIndexOf(Object): returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found.
         Examples:

         */
        List <String> list6 = new ArrayList<>(Arrays.asList("Anar","Zeynab","Zehra","Movlud","apple","banana"));

        if(list6.contains("Zeynab")){
            System.out.println("Found the element");
        }else{
            System.out.println("There is no such element");
        }

        int firstIndex = list6.indexOf("Anar");
        int lastIndex = list6.indexOf("banana");
        System.out.println(firstIndex);
        System.out.println(lastIndex);

        /**
         6. Sorting a list
         Before Java 8, the simplest way to sort out elements in a list is using the Collections.sort() static method which sorts the specified list into ascending order, based on the natural ordering of its elements. Here’s an example:
         */

        List <String> list7 = new ArrayList<>(Arrays.asList("Anar","Zeynab","Zehra","Movlud","Apple","Banana","1"));
        Collections.sort(list7);
        System.out.println(list7);
/**
 7. Copying elements from one list into another
 The Collections.copyList(dest, src) static method allows us to copy all elements from the source list into the destination one. Note that the destination list must be large enough to contain the entire source list. Here’s an example:
 */

        List<String> sourceList = new ArrayList<String>();
        sourceList.add("A");
        sourceList.add("B");
        sourceList.add("C");
        sourceList.add("D");
        List<String> destList = new ArrayList<String>();
        destList.add("V");
        destList.add("W");
        destList.add("X");
        destList.add("Y");
        destList.add("Z");
     //   System.out.println("destList before copy: " + destList);
        Collections.copy(destList, sourceList);
        System.out.println("destList after copy: " + destList);
/**
 9. Reversing elements in a list
 To reverse order of elements in a list, use the Collections.reverse() static method. Here’s a quick example:
 */
        List <String> list8 = new ArrayList<>(Arrays.asList("Anar","Zeynab","Zehra","Movlud","Apple","Banana","1"));

        Collections.reverse(list8);
        System.out.println(list8);

        List <String> list9 = new ArrayList<>(Arrays.asList("Anar","Zeynab","Zehra","Movlud","Apple","Banana","1"));

        /**
         11. Converting between Lists and arrays
         The Java Collection Framework allows us to easily convert between lists and arrays.
         The Arrays.asList(T… a) method converts an array of type T to a list of type T. Here’s an example:
         */

        List<String> listNames = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
        List<Integer> listNumbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
        System.out.println(listNames);
        System.out.println(listNumbers);

        List<String> listWords = new ArrayList<String>(Arrays.asList("ana","ata","baba"));
// add elements to the list
        String [] arrayWords = (String[]) listWords.toArray();
        System.out.println(Arrays.toString(arrayWords));

    }
}
