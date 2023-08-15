package LinkedLists;


public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    //Inner class (Nested class)
    class Node {
        int valor;
        Node next;
    
        Node(int valor){
            this.valor = valor;
            next = null;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public LinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.valor + "---->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        System.out.println("\nHead: "+head.valor);
    }

    public void getTail(){
        System.out.println("\nTail: "+tail.valor);
    }

    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public void validacionEnCero(Node node){
        if (length == 0){
            head = node;
            tail = node;
        }
    }

    public void appendNode(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            
        }
        length ++;
    }

    public Node removeLast(){
        Node presentNode = head;
        Node nextNode = head;
        if (length == 0){
            System.out.println("No hay nada en la lista");
            return null;
        } else{
            while(nextNode.next != null){
                presentNode = nextNode;
                nextNode = nextNode.next;
            }
            tail = presentNode;
            tail.next = null;
            length --;
        }
        if (length == 0){
            head = null;
            tail = null;
        }
        return nextNode;

    }

    public void preppendNode(int value){
        Node newNode = new Node(value);
        // Node temp = head;
        if (length == 0){
            head = newNode;
            tail = newNode;
            
        } else {
            newNode.next = head;
            head = newNode;
        }
        length ++;
    }

    public Node removeFirst(){
        Node temp = head;
        if (length == 0){
            System.out.println("Esta vacia");
            return null;
        } else {
            head = head.next;
            temp = null;
            length --;
        }
        if (length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        Node contador = head;
        if (index > length || index < 0){
            return null;
        } else if (index == 1){
            return contador;
        } else {
            for (int i = 1; i < index; i++){
                contador = contador.next;
            }
        }
        return contador;
    }

    public boolean set(int index, int value){
        if (length == 0 || index > length || index < 0){
            System.out.println("El index no es valido o la lista esta vacia");
            return false;
        } else {
            Node toChange = get(index);
            toChange.valor = value;
            System.out.println("Nodo cambiado");
            return true;
        }
    }

    public boolean insert(int index, int value){
        if (index < 0 || index >length){
            System.out.println("El index no es valido");
            return false;
        } else if (index == 1){
            preppendNode(value);
        } else if (index == length){
            appendNode(value);
        } else {
            Node anterior = get(index - 1);
            Node nuevo = new Node(value);
            nuevo.next = anterior.next;
            anterior.next = nuevo;
            length ++;
        }
        return true;
    }

    public Node remove(int index){
        
        if (index < 0 || index > length){
            System.out.println("No es un index valido");
            return null;
        } 
        if (index == 1) return removeFirst();
        if (index == length) return removeLast();

        Node before = get(index - 1);
        Node after = before.next;

        before.next = after.next;
        after.next = null;
        length --;
        return after;
    }

    public void reverse(){
        Node actual = head;
        head = tail;
        tail = actual;
        Node before = null;
        Node next = actual.next;

        while (next != null){
            next = actual.next;
            actual.next= before;
            before = actual;
            actual = next;
        }

    }


}
