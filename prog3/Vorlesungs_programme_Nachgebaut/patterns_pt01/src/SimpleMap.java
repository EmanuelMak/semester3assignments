

public interface SimpleMap<Key, Value> extends BasicMap<Key, Value> {

    @Override
    default Value get(Key key){
        mapElement<Key, Value> tmp = mapElement.root;
        while(tmp.key != key && tmp != mapElement.nill){
            tmp = tmp.next;
        }
        if(tmp == mapElement.nill){
            System.out.println(""+key + "is not in the list");
            return null;
        }
        return tmp.value;
    }


    @Override
    default void put(Key key, Value val){
        mapElement<Key, Value> tmp = mapElement.root;
        if(tmp == mapElement.nill){
            mapElement.root = new mapElement<Key,Value>(key,val);
            return;
        }

        while(tmp.next != tmp.nill){
            tmp = tmp.next;
        }
        tmp.next = new mapElement<Key, Value>(key,val);
        tmp.next.next = tmp.nill;
    }

    @Override
    default void printList(){
        mapElement <Key,Value> tmp = mapElement.root;
        while(tmp != mapElement.nill){
            System.out.print(tmp.toString());
            tmp = tmp.next;
        }
    }


    default Iterable<Value> iterator(){
        return new Iterable<Value>(){
            mapElement <Key,Value> it = mapElement.root;
            @Override
            public boolean hasNext(){
                return !(it == null);
            }
            @Override
            public Value next(){
                Value val = it.value;
                it = it.next;
                return val;
            }
        };
    }

    default public String listToString(){
        String s = "";
        try{
        Iterable it = this.iterator();
        while(it.hasNext()) {
            s = s + it.next();
        }
        } catch(Exception e){
            s = s + e.getMessage();
        }
        return s;
    }

    @Override
    default public void remove(Key key){
        Iterable it = this.iterator();
        mapElement<Key,Value> tmp = mapElement.root;
        while(it.hasNext()){
            if(tmp.next.key == key){
                tmp.next = tmp.next.next;
                    return;
            }
            tmp = tmp.next;
            it.next();
        }
        System.out.println(""+ key +" no sutch element in list");
        return;
    }
}
