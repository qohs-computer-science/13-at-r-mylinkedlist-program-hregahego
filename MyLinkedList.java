//Steven Wang, CP3, Pd.4
public class MyLinkedList
{
    private int size = 0;
    private ListNode head = new ListNode(null, null);
    private ListNode pointer;
    public MyLinkedList() {
        
    }
 
    private ListNode moveTo(ListNode temp, int idx) {
        for(int i = 0; i < idx; i++) {
            temp = temp.getNext();
        }
        return temp;
    } //end moveTo


    private ListNode moveToEnd(ListNode temp) {
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    } //end moveToEnd

    public int size() {
        return size;
    } //end size

    public boolean isEmpty() {
        return size == 0;
    } //end isEmpty

    public boolean add(Object obj) {
        if (size == 0) {
            head = new ListNode(obj, null);
        } else {
            pointer = head;
            pointer = moveToEnd(pointer);
            pointer.setNext(new ListNode(obj, null));
        }
        size++;
        return true;
    } //end add

    public boolean addFirst(Object obj) {
        if (size == 0) {
            head = new ListNode(obj, null);
        } else {
            head = new ListNode(obj, head);
        }
        size++;
        return true;

    } //end addFirst

    public boolean addLast(Object obj) {
        add(obj);
        return true;
    } //end addLast

    public Object set(int i, Object obj) {
        pointer = head;
        pointer = moveTo(pointer, i);
        Object prev = pointer.getValue();
        pointer.setValue(obj);
        return prev;
    } //end set

    public Object get(int i) {
        pointer = head;
        pointer = moveTo(pointer, i);
        return pointer.getValue();
    } //end get

    public Object remove(int i) {
        if (i == 0) {
            Object prev = head.getValue();
            head = head.getNext();

            size--;
            return prev;
        }
        Object prev = get(i);
        
        pointer = head;
        pointer = moveTo(pointer, i+1);
        ListNode half2 = pointer;


        pointer = head;
        pointer = moveTo(pointer, i-1);
        pointer.setNext(half2);
        
        size--;
        
        return prev;
    } //end remove

    public Object removeFirst() {
        return remove(0);
    } //end removeFirst

    public Object removeLast() {
        return remove(size - 1);
    } //end removeLast

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
    } //end toString



} //end class
