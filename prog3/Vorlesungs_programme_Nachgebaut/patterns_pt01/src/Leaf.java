public class Leaf<directory,file> extends MyComponent<directory,file> {

    file f;
    Leaf(file f){
        this.f = f;
    }


    @Override
    public String toString(){
        String s = tabs() + f.toString() + "\n";
        this.tabs = 0;
        return s;

    }


}
