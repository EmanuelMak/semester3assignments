import java.util.Collection;

public abstract class MyComponent<directory,file>{
    public int tabs = 0;
    public String tabs(){
        String s = "";
        for(int i = 0; i<tabs; i++){
            s = s + "\t";
        }
        return s;
    }
    void add(MyComponent<directory,file> k){};
    int count(){
        return 1;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
