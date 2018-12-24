import java.nio.charset.Charset;

public interface UnicodeMessage {
    public String getText();
    default public byte[] get_UTF8_Message(){
        return getText().getBytes(Charset.forName("UTF-8"));
    }
}
