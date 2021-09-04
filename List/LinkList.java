package List;

public class LinkList {
    Node m_head;
    int size;

    LinkList() {
        size = 0;
        m_head = null;
    }

    void InsertFront(Node node) {
        node.m_next = m_head;
        m_head = node;
        size++;
    }

    void InsertEnd(Node node) {
        if (m_head == null) m_head = node;
        else {
            Node cur = m_head;
            while(cur.m_next != null) {
                cur = cur.m_next;
            }
            cur.m_next = node;
        }
    }

    int GetLength() {
        return size;
    }


}
