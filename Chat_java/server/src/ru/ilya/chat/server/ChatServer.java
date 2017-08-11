package ru.ilya.chat.server;

import ru.ilya.chat.network.TCPConnectionListener;
import ru.ilya.chat.network.TCPConnection;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class ChatServer implements TCPConnectionListener {
    public static void main(String[] args) {
        new ChatServer();
    }

    private final ArrayList<TCPConnection> connections = new ArrayList<>();

    private ChatServer() {
        System.out.println("Server running...");
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                try {
                    new TCPConnection(this, serverSocket.accept());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public synchronized void onConnectionReady(ru.ilya.chat.network.TCPConnection tcpConnection) {
        connections.add(tcpConnection);
        sendToAllConnection("Client connected: " + tcpConnection);
    }

    @Override
    public synchronized void onReceiveString(ru.ilya.chat.network.TCPConnection tcpConnection, String value) {
        sendToAllConnection(value);
    }

    @Override
    public synchronized void onDisconnect(ru.ilya.chat.network.TCPConnection tcpConnection) {
        connections.remove(tcpConnection);
        sendToAllConnection("Client disconnected: " + tcpConnection);
    }

    @Override
    public synchronized void onException(ru.ilya.chat.network.TCPConnection tcpConnection, Exception e) {
        System.out.println("TCPConnection exeption: " + e);
    }

    private void sendToAllConnection(String value){
        System.out.println(value);
        for (TCPConnection e : connections) e.sendString(value);
    }
}
