public interface BasicMap<key, value> {

    value get(key Key);
    void put(key key, value value);
    void printList();
    void remove(key key);
    class mapElement <Key, Val>{
        Key key;
        Val value;
        mapElement<Key, Val> next;
        mapElement(Key key,Val val){
           this.key = key;
           this.value = val;
           this.next = nill;
        }
        static mapElement nill = new mapElement(null,null);
        public static mapElement root = nill;
        @Override
        public String toString(){
            if(this.equals(nill)){
                System.out.println("cant print nill");
                return "nill \n";
            }
            return "key: "+  key.toString() +"value: " + value.toString() + "\n";
        }
        boolean equals(mapElement e){
            if(!(e.getClass().equals(this.getClass()))) return false;
            if(!(this.key == e.key && this.value == e.value && this.next == e.next)) return false;
            return true;
        }
    }



}
