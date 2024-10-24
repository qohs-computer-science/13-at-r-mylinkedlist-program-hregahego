public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList list = new MyLinkedList();
    list.add("Hello");
    list.addLast("HAHA");
    list.addLast("World");
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");
    list.add("G");

    
    list.set(4, "Letter B");
    // System.out.println(list.toString());
    // System.out.println(list.get(4));
    
    list.remove(5);
    System.out.println(list.toString());
    list.removeFirst();
    System.out.println(list.toString());

  } // end main
  
} // end class
