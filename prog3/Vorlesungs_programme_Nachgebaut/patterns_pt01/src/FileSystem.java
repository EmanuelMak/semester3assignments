import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class FileSystem {
    private String pwd;
    private String name;
    private String accesright;
    private String erstellt;

    FileSystem(String name){
        this.name = name;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.erstellt = dtf.format(now);
        this.accesright = "acces,read";
    }
    FileSystem(String name, String accesright){
        this(name);
        this.accesright = accesright;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return pwd + " name: "+ name + "erstellt: " + erstellt + "accesright: " + accesright;
    }
}
