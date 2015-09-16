public class ListNode {
private Object myItem;
private ListNode myNext; 
public ListNode (Object item, ListNode next) {
myItem = item;
myNext = next;
}
public ListNode (Object item) {
this (item, null);
}
public Object item () {
return myItem;
}
public ListNode next () {
return myNext;
}

public Object get(int i) {
    if (i == 0) {
        return myItem;
    }
    if (myNext == null) {
        throw new IllegalArgumentException("ERROR");
    }
    myItem = next().item();
    myNext = next().next();
    System.out.println(myItem);
    return get(i- 1);
}

public static void main(String[] args)
{
    ListNode n1, n2, n3;
    n3 = new ListNode(7, null);
    n2 = new ListNode(5, n3);

    n1 = new ListNode(3, n2);

    
    System.out.println(n1.get(4));
}
}