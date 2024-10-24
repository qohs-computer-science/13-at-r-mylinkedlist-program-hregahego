public class MyLinkedList
{
    private int size = 0;
    private ListNode head = new ListNode(null, null);
    private ListNode pointer;
    public MyLinkedList() {
        
    }
 
    private ListNode moveTo(ListNode temp, int idx) {
        for(int i = 0; i < idx; i++) {
            // System.out.println(temp.getValue());
            temp = temp.getNext();
        }
        return temp;
    }


    private ListNode moveToEnd(ListNode temp) {
        while (temp.getNext() != null) {
            // System.out.println(temp.getValue());
            temp = temp.getNext();
        }
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(Object obj) {
        if (size == 0) {
            head = new ListNode(obj, null);
        } else {
            pointer = head;
            pointer = moveToEnd(pointer);
            //System.out.println(pointer.getValue());
            pointer.setNext(new ListNode(obj, null));
        }
        size++;
        return true;
    }

    public boolean addFirst(Object obj) {
        if (size == 0) {
            head = new ListNode(obj, null);
        } else {
            head = new ListNode(obj, head);
        }
        size++;
        return true;

    }

    public boolean addLast(Object obj) {
        add(obj);
        return true;
    }

    public Object set(int i, Object obj) {
        pointer = head;
        pointer = moveTo(pointer, i);
        Object prev = pointer.getValue();
        pointer.setValue(obj);
        return prev;
    }

    public Object get(int i) {
        pointer = head;
        pointer = moveTo(pointer, i);
        return pointer.getValue();
    }

    public Object remove(int i) {
        Object prev = get(i);
        
        pointer = head;
        pointer = moveTo(pointer, i+1);
        //System.out.println(pointer.getValue());
        //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHH!!!!!!!");
        ListNode half2 = pointer;


        pointer = head;
        pointer = moveTo(pointer, i-1);
        pointer.setNext(half2);
        
        size--;
        
        return prev;
    }

    public Object removeFirst() {
        Object prev = head.getValue();
        head = head.getNext();

        size--;
        return prev;
    }

    public Object removeLast() {
        pointer = head;
        pointer = moveToEnd(pointer);
        Object prev = pointer.getValue();
        pointer = null;

        size--;
        return prev;
    }

    public String toString() {
        String result = "";
        pointer = head;
        int i = 0;
        while (pointer != null) {
            result += i + ": " + pointer.getValue().toString() + "\n";
            pointer = pointer.getNext();
            i++;
        }
        return result;
    }



}
