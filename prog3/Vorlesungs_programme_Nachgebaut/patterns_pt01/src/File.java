import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class File extends FileSystem{
    private String val;
    private String contenttype;
    File(String name){
        super(name);
        this.val = "";
        contenttype = "text";


    }
    File(String name,String val){
        this(name);
        this.val = val;
    }
    File(String name,String contenttype,String val){
        this(name,val);
        this.contenttype = contenttype;
    }
    @Override
    public String toString() {
        return "File" + super.toString() + "content: " + val;
    }

}
