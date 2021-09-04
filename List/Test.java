package List;

public class Test {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        System.out.println("The size of current linklist is " + linkList.GetLength());

        for(int i=0; i<10; i++) {
            linkList.InsertFront(new Node(10));
            System.out.println("The size of current linklist is " + linkList.GetLength());
        }

    }
}
