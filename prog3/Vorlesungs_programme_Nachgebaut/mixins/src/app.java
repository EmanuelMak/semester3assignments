public class app {
    public static void main(String[] args) {
        Message myMessage = new Message("this is my message");
        System.out.print("myMessage: " +myMessage.getText() + "\n");
        System.out.print("myMessage Shouted: " + myMessage.getEscalatedText()+ "\n");
        System.out.print("myMessage UTC-8: " + myMessage.get_UTF8_Message() + "\n");
    }
}
