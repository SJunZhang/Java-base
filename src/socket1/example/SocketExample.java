package socket1.example;

import java.io.IOException;
import java.net.InetAddress;

import socket1.SocketClient;
import socket1.SocketServer;

class SocketExample {
    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        SocketServer server = new SocketServer(5556, new EchoHandler());
        System.out.println("Server starts.");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

        SocketClient client = new SocketClient(InetAddress.getLocalHost(), 5556);
        client.println("Hello!");
        System.out.println(client.readLine());
            
        client.close();
        server.close();
    }
}