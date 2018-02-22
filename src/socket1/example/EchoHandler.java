package socket1.example;

import socket1.Connection;
import socket1.MessageHandler;

class EchoHandler implements MessageHandler {
    @Override
    public void onReceive(Connection connection, String message) {
        connection.println(message);
    }
}