package Trees;

public class BinaryTrees {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    public BinaryTrees(int value){
        Node newNode = new Node(value);
        root = newNode;
    }

    public BinaryTrees(){
        root = null;
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true){
            if (temp.value == value){
                return false;
            }
            if (temp.value > value){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value){
        if (root == null){
            return false;
        }
        Node temp = root;
        while (temp != null){
            if (temp.value == value){
                return true;
            }
            if (value < temp.value){
                temp = temp.left;
            } else {
                temp = temp.right;
            }

        }
        return false;
    }
}

