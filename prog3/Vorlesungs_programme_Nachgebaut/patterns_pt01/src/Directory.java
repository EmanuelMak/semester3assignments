public class Directory extends FileSystem {
    Directory(String name){
        super(name);
    }
    Directory(String name,String accesright){
        super(name,accesright);
    }

    @Override
    public String toString(){
        return "Directory" + super.toString();
    }
}
