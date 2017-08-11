package ru.ilya.chat.client;

import ru.ilya.chat.network.TCPConnection;
import ru.ilya.chat.network.TCPConnectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ClientWindow extends JFrame implements ActionListener, TCPConnectionListener {
    private static final String IP_ADDR = "109.188.126.1";
    private static final int PORT = 8080;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientWindow::new);
    }

    private final JTextArea log = new JTextArea();
    private final JTextArea fieldNickname = new JTextArea("ilya");
    private final JTextField fieldInput = new JTextField();
    private TCPConnection connection;

    private ClientWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT); //задаем размеры окна
        setLocationRelativeTo(null); //устанавливаем окно поцентру
        setAlwaysOnTop(true); //поверх других окон
        log.setEnabled(false);//запрещаем редактирование
        log.setLineWrap(true);//автомотический перенос строк
        add(log, BorderLayout.CENTER);

        fieldInput.addActionListener(this);
        add(fieldInput, BorderLayout.SOUTH);
        add(fieldNickname, BorderLayout.NORTH);

        setVisible(true); // делаем окно видимым

        try {
            connection = new TCPConnection(this, IP_ADDR, PORT);
        } catch (IOException e) {
            e.printStackTrace();
            ptintMsg("Connection exeption: " + e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = fieldInput.getText();
        if (msg.equals("")) return;
        fieldInput.setText(null);
        connection.sendString(fieldNickname.getText() + ": " + msg);
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        ptintMsg("Connection ready...");
    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String value) {
        ptintMsg(value);
    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        ptintMsg("Connection close...");
    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        ptintMsg("Connection exeption: " + e);
    }

    private synchronized void ptintMsg(String msg){
        SwingUtilities.invokeLater(() -> {
            log.append(msg + "\n");
            log.setCaretPosition(log.getDocument().getLength());
        });
    }
}
