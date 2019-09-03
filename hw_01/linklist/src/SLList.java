public class SLList {
    // the first node should be sentinel.next
    private InNode sentinel;
    private int size;

    public SLList() {
        sentinel = new InNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new InNode(63, null);
        sentinel.next = new InNode(x, null);
        size = 1;
    }

    private void addFirst(int i) {
        sentinel.next = new InNode(i, sentinel.next);
        size = size + 1;
    }

    private void addLast(int i) {
        //SLList L = new SLList(i);
        InNode p = sentinel;
        //move p until it reaches the end of the list!
        while (p.next != null) {
            p = p.next;
        }
        p.next = new InNode(i, null);
        size = size + 1;
    }

    private int getFirst() {
        return sentinel.next.item;
    }

    /*return the size of list starts at node p*/
    private static int size(InNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        /*use iterating method to get size of list.*/
       /* int count = 0;
        InNode p = first;
        if (p.next == null) {
            return 1;
        }
        //move p until it reaches the end of the list!
        while (p.next != null) {
            p = p.next;
            count++;
        }
        return count + 1;*/


        /*use recursive to get size of list.*/
        //return size(first);
        return size;

    }

    public void deleteFirst() {
        InNode p = sentinel;
        if (p.next != null) {
            p = p.next;
            sentinel = p;
        }
        size = size - 1;

    }

    public static void main(String[] args) {
        SLList L = new SLList();

        //SLList L = new SLList(15);
        // L.addFirst(10);
        // L.addFirst(5);

        // L = new Inilist(10,L);
        // L = new Inilist(5,L);
        L.addLast(3);
        int f = L.getFirst();
        int size = L.size();
        // L.deleteFirst();
        // int last = L.getLast();
        System.out.println(f);
        System.out.println(size);

    }
}
