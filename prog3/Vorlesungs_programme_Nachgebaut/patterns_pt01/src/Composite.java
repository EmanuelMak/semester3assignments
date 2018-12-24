import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public  class Composite<directory,file> extends MyComponent<directory,file>{
    LinkedList<MyComponent<directory,file>> collections = new LinkedList<>();
    private directory val;
    Composite(directory d){
        this.val = d;
    }
    @Override
    public int count(){
        int ret = 0;
        Iterator<MyComponent<directory,file>> it = collections.iterator();
        while(it.hasNext()){
            ret += it.next().count();
        }
        return ret +1;
    }
    @Override
    public String toString(){
        String s = this.tabs() + val.toString() + "\n";
        Iterator<MyComponent<directory,file>> it = collections.iterator();
        while(it.hasNext()){
            MyComponent<directory,file> tmp = it.next();
            tmp.tabs = this.tabs + 1;
            s += tmp.toString();
        }
        this.tabs = 0;
        return s;
    }
    public void printContent(){
        System.out.println(this.toString());
    }
    @Override
    public void add(MyComponent<directory,file> k) {
            collections.add(k);
        }






}
