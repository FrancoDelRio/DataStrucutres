package Trees;

public class main {
    public static void main(String[] args) {
        BinaryTrees bst = new BinaryTrees();

        // System.out.println(bst.root.value);
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);

        bst.insert(27);
        System.out.println(bst.root.left.right.value);
        System.out.println(bst.contains(53));
    }
}
