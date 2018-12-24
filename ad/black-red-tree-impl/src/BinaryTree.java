public class BinaryTree<T extends Comparable<T>> implements Tree<T>{
    BinaryNode<T> root = BinaryNode.nill;

    public void add(T t) {

        BinaryNode<T> node = new BinaryNode<>(t);
        if(this.root == BinaryNode.nill)this.root = node;
        BinaryNode<T> tmp = this.root;
        while(!tmp.equals(node)){
            if(node.compareTo(tmp)>0){
                if(tmp.getNextBigger().equals(BinaryNode.nill))
                    tmp.setNextBigger(node);
                tmp = tmp.getNextBigger();

            }
            else {
                if (tmp.getNextSmaler().equals(BinaryNode.nill))
                    tmp.setNextSmaler(node);
                tmp = tmp.getNextSmaler();
            }
        }
    }

    private BinaryNode<T> getNode(T t){
        BinaryNode<T> toGet = this.root;
        while (true){
            if(t.compareTo(toGet.getValue()) == 0)
                break;
            if(t.compareTo(toGet.getValue()) < 0) {
                if(toGet.getNextSmaler().equals(BinaryNode.nill))
                    break;
                toGet = toGet.getNextSmaler();
            }
            if(t.compareTo(toGet.getValue()) > 0) {
                if(toGet.getNextBigger().equals(BinaryNode.nill))
                    break;
                toGet = toGet.getNextBigger();
            }
        }
        return toGet;
    }

    private BinaryNode<T> getParent(T t){
        BinaryNode<T> Parent = getParent(this.getNode(t));
        return Parent;
    }
    private void transplant(BinaryNode<T> node1,BinaryNode<T> node2){
        BinaryNode<T> node1Big = node2.getNextBigger();
        BinaryNode<T>node1Smal = node2.getNextSmaler();
        BinaryNode<T>node2Big = node1.getNextBigger();
        BinaryNode<T>node2Smal = node1.getNextSmaler();
        BinaryNode<T>parentnode1 = getParent(node2);
        BinaryNode<T>parentnode2 = getParent(node1);
        node1.setNextSmaler(node1Smal);
        node1.setNextBigger(node1Big);
        parentnode1.setChild(node1);
        node2.setNextSmaler(node2Smal);
        node2.setNextBigger(node2Big);
        parentnode2.setChild(node2);
    }
    private BinaryNode<T> getParent(BinaryNode<T> node){

        BinaryNode<T> parent = this.root;
        if(parent.equals(node))
            parent =  BinaryNode.nill;
        while(true){
            if(node.compareTo(parent) < 0 ){
                if(parent.getNextSmaler().equals(BinaryNode.nill)) {
                    parent = BinaryNode.nill;
                    break;
                }
                if(parent.getNextSmaler().equals(node))
                    break;
                parent = parent.getNextSmaler();

            }
            if(parent.getNextBigger().equals(BinaryNode.nill)) {
                parent = BinaryNode.nill;
                break;
            }
            if(parent.getNextBigger().equals(node))
                break;
            parent = parent.getNextBigger();
        }
        return parent;
    }
    private BinaryNode<T> removeChild(BinaryNode<T> child){
        BinaryNode<T> parent = getParent(child);
        if(parent.equals(BinaryNode.nill))
            return BinaryNode.nill;
        if(parent.getNextBigger().equals(child))parent.setNextBigger(BinaryNode.nill);
        parent.setNextSmaler(BinaryNode.nill);
        return child;
    }
    public void remove(T toRemove){
        this.remove(getNode(toRemove));
        return ;
    }
    public void remove(BinaryNode<T> toRemove){
        BinaryNode<T> parent;
        if(toRemove.getNextBigger().equals(BinaryNode.nill) && toRemove.getNextSmaler().equals(BinaryNode.nill)) {
            removeChild(this.getParent(toRemove));
            return;
        }
        transplant(toRemove,getSupirior(toRemove));
        remove(toRemove);
    }
    public BinaryNode<T> goBig(BinaryNode<T> node){
        return node.getNextBigger();
    }
    public BinaryNode<T> getSmal(BinaryNode<T> node){
        return node.getNextSmaler();
    }
    public BinaryNode<T> greedyBig(BinaryNode<T> node){
        BinaryNode<T> Big = node;
        while(!Big.getNextBigger().equals(BinaryNode.nill)){
            Big = Big.getNextBigger();
        }
        return Big;
    }
    public BinaryNode<T> greedySmal(BinaryNode<T> node){
        BinaryNode<T> Smal = node;
        while(!Smal.getNextSmaler().equals(BinaryNode.nill)){
            Smal = Smal.getNextSmaler();
        }
        return Smal;
    }
    public BinaryNode<T> getSupirior(BinaryNode<T> node){
        if(node.getNextSmaler().equals(BinaryNode.nill) && node.getNextBigger().equals(BinaryNode.nill))
            return BinaryNode.nill;
        BinaryNode<T> supirior;
        if(node.getNextSmaler().equals(BinaryNode.nill))
            return greedySmal(node.getNextBigger());
        return greedyBig(node.getNextSmaler());
    }
    public void print(){
        print(this.root);
    }
    public void print(BinaryNode<T> root){
        if(root.equals(BinaryNode.nill))
            return;
        print(root.getNextSmaler());
        System.out.println(root.toString());
        print(root.getNextBigger());
    }


}
