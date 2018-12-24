public class BlackRedTreeNode<T extends Comparable<T>> extends BinaryNode<T> {
    private boolean isRed;
    public BlackRedTreeNode<T> nill = new BlackRedTreeNode<T>(null, null, null);
    public boolean getIsRed(){
        return this.isRed;
    }
    public BlackRedTreeNode(T value, BlackRedTreeNode<T> nextBigger, BlackRedTreeNode<T> nextSmaler){
        super(value, nextBigger, nextSmaler);
    }

}
