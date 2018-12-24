public class Message implements ShoutedMessage, UnicodeMessage, myFunctions {
    private String text;
    public Message(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}

