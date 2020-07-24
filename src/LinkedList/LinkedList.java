package LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {

    Node head;
    int length = 0;

    void deletelist() {
        head = null;
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        length++;
//            
    }

    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean search(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }
    
    public int getNthNode(int index){
        
        Node current =head;
        for (int i =0; i <index;i++){
            current=current.next;
        }
        
        
        return current.data;
    }
    
    public int getNthNodeFromLast(int n){
        
        Node current =head;
        if(n>length){
            return -1;
        }
        
        if (n<=0){
            return -1;
        }
        for (int i =1; i <=length-n;i++){
            current=current.next;
        }
        
        
        return current.data;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(70);

        System.out.println("start printing list: \n");
        ll.printlist();
        

        System.out.println("\nLength of LinkedList is: " + ll.length + "\n");

        int search_val = 1;

        System.out.println("Search for key=" + search_val + " in LinkedList is: " + String.valueOf(ll.search(ll.head, search_val)) + "\n");

        int index=2;
        System.out.println("Node at index "+index+" data is: " +ll.getNthNode(index) + "\n");

        int n=3;
        System.out.println(n+" Node from last: " +ll.getNthNodeFromLast(n) + "\n");

    }

}
