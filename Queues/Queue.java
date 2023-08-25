package Queues;

import javax.sound.midi.Soundbank;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node{
        Node next;
        int value;

        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.print(temp.value + "------> ");
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("\nFirst: " + first.value);
    }
    
    public void getLast(){
        System.out.println("\nLast: " + last.value);
    }

    public void getLength(){
        System.out.println("\nLength: " + length);
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0){
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length ++;
    }

    public Node dequeueLast(){
        if (length == 0){
            return null;
        }
        Node temp = last;
        if (length == 1){
            first = null;
            last = null;
        } else {
            Node prev = first;
            temp = prev.next;
            while(prev.next != last){
                temp = temp.next;
                prev = prev.next;
            }
            last = prev;
            last.next = null;
        }
        length --;
        return temp;
    }

    public Node dequeueFirst(){
        if (length == 0){
            return null;
        }
        Node temp = first;
        if (length == 0){
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length --;
        return temp;
    }
}
