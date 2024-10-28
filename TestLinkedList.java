//Steven Wang, CP3, Pd.4
public class TestLinkedList {
   public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.addLast("J");
        
        list.set(4, "Letter E");
        Object gotE = list.get(4);

        System.out.println("5th item: " + gotE);

        Object removed1;
        Object removed2;
        Object removed3;
        
        removed1 = list.removeFirst();
        removed2 = list.remove(1);
        removed3 = list.removeLast();

        System.out.println("First removed: " + removed1);
        System.out.println("Second removed: " + removed2);
        System.out.println("Third removed: " + removed3);

        System.out.println("List after modifications: ");
        System.out.println(list.toString());

        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());


    
   }  //end main
} //end class
