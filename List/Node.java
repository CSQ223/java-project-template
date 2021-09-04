package List;

public class Node {
    int  m_data;
    Node m_next;

    Node(int data) {
        m_data = data;
        m_next = null;
    }

    boolean HasNext() {
        return m_next!=null;
    }
}
