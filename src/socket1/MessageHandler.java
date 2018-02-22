package socket1;

public interface MessageHandler {
    public void onReceive(Connection connection, String message);
}