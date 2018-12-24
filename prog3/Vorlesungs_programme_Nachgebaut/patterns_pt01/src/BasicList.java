public interface BasicList<valType> {
    class ListElement<Type>{
        Type val;
        ListElement<Type> next = nill;
        ListElement(Type val){
            this.val = val;
            this.next = nill;
        }
        static ListElement nill = new ListElement(null);
        static ListElement root = nill;
    }
    public void add(valType val);
    public void remove(valType val);
    void printList();
    valType get(int index);
}
