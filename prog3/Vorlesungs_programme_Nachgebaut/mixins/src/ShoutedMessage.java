public interface ShoutedMessage {
    public String getText();
    default public String getEscalatedText(){
        return getText().toUpperCase();
    }
}

