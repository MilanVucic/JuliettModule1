package module_2.lesson_10;

public class RecursiveLinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            addHelper(head, data);
        }
    }

    private void addHelper(Node<T> node, T data) {
        if (node.next != null) {
            addHelper(node.next, data);
            return;
        }
        node.next = new Node<>(data);
    }

    public void printList() {
        printHelper(head);
    }

    private void printHelper(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printHelper(node.next);
    }

    public int size() {
        return sizeHelper(head);
    }

    private int sizeHelper(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeHelper(node.next);
    }

    // todo add contains, indexof, insert at index

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
