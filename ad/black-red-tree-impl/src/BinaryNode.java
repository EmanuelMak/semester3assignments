public class BinaryNode<T extends Comparable<T>> implements Comparable<BinaryNode<T>>{

    private T value;
    public static final BinaryNode nill = new BinaryNode(null, null, null);
    private BinaryNode<T> nextBigger = nill;

    public BinaryNode<T> getNextBigger() {
        return nextBigger;
    }

    public void setNextBigger(BinaryNode<T> nextBigger) {
        this.nextBigger = nextBigger;
    }

    public void setNextSmaler(BinaryNode<T> nextSmaler) {
        this.nextSmaler = nextSmaler;
    }

    public BinaryNode<T> getNextSmaler() {
        return nextSmaler;
    }
    private BinaryNode(){
        this.setNextSmaler(nill);
        this.setNextBigger(nill);
    }
    public BinaryNode(T t){
        this();
        this.value = t;
    }

    private BinaryNode<T> nextSmaler = nill;


    public BinaryNode(T value, BinaryNode<T> nextBigger, BinaryNode<T> nextSmaler){
        this.value = value;
        this.nextBigger = nextBigger;
        this.nextSmaler = nextSmaler;
    }
    public T getValue() {
        return this.value;
    }
    @Override
    public int compareTo(BinaryNode<T> val){
        return this.value.compareTo(val.getValue());
    }
    boolean equals(BinaryNode<T> n){

        if(this.getValue() != n.getValue())
            return false;
        if(this.getNextSmaler() != n.getNextSmaler())
            return false;
        if( this.getNextBigger()!= n.getNextBigger())
            return false;
        return true;
    }
    @Override
    public String toString(){
        return this.getValue().toString();
    }
    public void setChild(BinaryNode<T> child){
        if(child.compareTo(this)<0){
            this.setNextSmaler(child);
        }
        if(child.compareTo(this) == 0)
            System.out.println("tree was destroyed");
        this.setNextBigger(child);
    }



}
