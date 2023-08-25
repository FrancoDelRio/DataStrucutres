package DoubleLinkedLists;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    //Inner class (Nested class)
    class Node {
        int value;
        Node next;
        Node prev;
    
        Node(int value){
            this.value = value;
            next = null;
        }
    }

    public DoubleLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public DoubleLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ----> ");
            temp = temp.next;
        }
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length ++;
    }

    public void preppend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length ++;
    }

    public Node removeLast(){
        
        if (length == 0){
            return null;
        }
        Node temp = tail;
        if (length == 1){
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            temp.prev = null;
            tail.next = null;
        }
        length --;
        return temp;
        
    }

    public Node removeFirst(){
        
        if (length == 0){
            return null;
        }
        Node temp = head;
        if (length == 1){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length --;
        return temp;
        
    }

    public Node get(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if (index < length /2){
            for (int i = 0; i < index ; i++){
                temp = temp.next;

            }
        } else {
                temp = tail;
                for(int i = length -1; i > index ; i--){
                    temp = temp.prev;
                }
            }
        return temp;
    }

    public boolean set(int index,int value){
        Node temp = get(index - 1);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert (int index, int value){
        if (index < 0 || index > length){
            return false;
        }
        if (index == 0){
            preppend(value);
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;

        before.next = newNode;
        after.prev = newNode;
        length ++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index > length){
            return null;
        }
        if (index == 0){
            return removeFirst();
        }
        if (index == length -1){
            return removeLast();
        }
        Node temp = get(index);
        Node after = temp.next;
        Node before = temp.prev;

        before.next = after;
        after.prev = before;

        temp.next = null;
        temp.prev = null;
        return temp;
        
    }

    
}