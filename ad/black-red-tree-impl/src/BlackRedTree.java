public class BlackRedTree<T extends Comparable<T>> extends BinaryTree<T> {
    private BinaryNode<T> root;
    public BinaryNode<T> getRoot(){
        return this.root;
    }
    public BlackRedTree(){
        this.root = BinaryNode.nill;
    }
    public BlackRedTree(BinaryNode<T> n){
        this.root = n;
    }
}
