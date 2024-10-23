public class MyLinkedList
{
    private int size = 0;
    private ListNode head = new ListNode(null, null);
    private ListNode pointer;
    public MyLinkedList() {
        
    }

    private moveTo(ListNode temp, int idx) {
        for(int i = 0; i < idx; i++) {
            temp = temp.getNext();
        }
    }


    private moveToEnd(ListNode temp) {
        while (temp.getValue() != null) {
            temp = temp.getNext();
        }
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
            moveToEnd(pointer);
            pointer.setValue(new ListNode(obj, null));
        }
        return true;
    }

    public boolean addFirst(Object obj) {
        if (size == 0) {
            head = new ListNode(obj, null);
        } else {
            head = new ListNode(obj, head);
        }
        return true;

    }

    public boolean addLast(Object obj) {
        add(obj);
        return true;
    }

    public Object set(int i, Object obj) {
        pointer = head;
        moveTo(pointer, i);
        Object prev = pointer.getValue();
        pointer.setValue(obj);
        return prev;
    }

    public Object get(int i) {
        pointer = head;
        moveTo(pointer, i);
        return pointer.getValue();
    }

    public Object remove(int i) {
        pointer = head;
        moveTo(pointer, i);
        Object prev = pointer.getValue();
        moveTo(pointer, i+1);
        
        ListNode half2 = pointer;

        pointer = head;
        moveTo(pointer, i-1);
        pointer = half2;
        
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
        
    }


}
