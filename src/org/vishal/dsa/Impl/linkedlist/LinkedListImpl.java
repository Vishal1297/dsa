package org.vishal.dsa.Impl.linkedlist;

class Node {
    private int data;
    private Node next;

    public Node() {
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedListImpl {

    private Node head;
    private int current;

    public LinkedListImpl() {
    }

    public void add(int element){
        if (head == null) head = new Node(element, null);
        else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(element, null));
        }
        current++;
    }

    public void addAtFirst(int element){
        if (head == null) head = new Node(element, null);
        else {
            Node node = head;
            head = new Node(element, node);
        }
        current++;
    }

    public void add(int element, int index){
        if (index < 0 || index > current) {
            throw new IllegalArgumentException("Invalid index");
        } else if (index == 0) {
            addAtFirst(element);
        }else {
            if (head == null) head = new Node(element, null);
            else {
                int currIndex = index;
                Node temp = head;
                while (currIndex > 1){
                    temp = temp.getNext();
                    currIndex--;
                }
                Node next = temp.getNext();
                temp.setNext(new Node(element, next));
            }
        }
    }

    public int remove(){
        if (head == null){
            return -1;
        }else {
            int elem = head.getData();
            head = head.getNext();
            return elem;
        }
    }

    public int remove(int index){
        if (index < 0) throw new IllegalArgumentException("Invalid index");
        else if (index == 0) return remove();
        else {
            if (head == null || index >= current) return -1;
            else {
                int currIndex = index;
                Node temp = head;
                while (currIndex > 1){
                    temp = temp.getNext();
                    currIndex--;
                }
                int removed = temp.getNext().getData();
                Node next = temp.getNext().getNext();
                temp.setNext(next);
                return removed;
            }
        }
    }

    public void clear() {
        this.head = null;
    }

    public int peek() {
        if (head == null) return -1;
        else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }

    public int get(int index){
        if (index < 0) throw new IllegalArgumentException("Invalid index");
        else if (head == null) {
            return -1;
        } else if (index == 0) {
            return head.getData();
        }else {
            if (index >= current - 1) return -1;
            else {
                int currIndex = index;
                Node temp = head;
                while (currIndex > 0){
                    temp = temp.getNext();
                    currIndex--;
                }
                return temp.getData();
            }
        }
    }

    public int pollFirst(){
        if (head == null) return -1;
        else  {
            return head.getData();
        }
    }

    public int length() { return current - 1; }

    public void print(){
        Node temp = head;
        if (temp == null) return;
        while (temp.getNext() != null){
            System.out.print(temp.getData() + " => ");
            temp = temp.getNext();
        }
        System.out.print(temp.getData());
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.add(4);
        linkedList.add(14);
        linkedList.add(40);
        linkedList.addAtFirst(2);
        linkedList.add(50, 1);
        // 2 => 50 => 4 => 14 => 40
        System.out.println("poll first " + linkedList.pollFirst());
        System.out.println("remove " + linkedList.remove());
        System.out.println("remove at 3 : " + linkedList.remove(3));
        System.out.println("length " + linkedList.length());
        System.out.println("peek " + linkedList.peek());
        System.out.println("get at 0 : " + linkedList.get(0));
        System.out.println("get at 3 : " + linkedList.get(3));
        System.out.println("length " + linkedList.length());
        System.out.print("LinkedList : ");
        linkedList.print();
    }
}
