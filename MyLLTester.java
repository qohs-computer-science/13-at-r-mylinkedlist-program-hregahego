public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList list = new MyLinkedList();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");
    list.add("G");
    list.add("H");
    list.add("I");
    list.add("J");

    
    list.set(1, "Letter B");
    // System.out.println(list.toString());
    // System.out.println(list.get(4));
    
    System.out.println(list.remove(5));
    System.out.println(list.toString());
    
  } // end main
  
} // end class
