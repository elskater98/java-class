public class LinkedList {

    public static class Node {

        public Node next;
        public String value;

        public Node(String value) {
            this.next = null;
            this.value = value;
        }
    }

    public Node linkedList;

    public LinkedList(String value) {
        this.linkedList = new Node(value);
    }


    public void add(String value) {

        if (this.linkedList.next == null) {
            this.linkedList.next = new Node(value);
        }
        else{
            Node current_node = this.linkedList.next;
            while (current_node.next != null){
                current_node = current_node.next;
            }
            current_node.next = new Node(value);
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("6");
    }
}
