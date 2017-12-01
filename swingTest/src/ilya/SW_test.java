package ilya;

import javax.swing.*;
import java.awt.*;

public class SW_test extends JFrame {

    public void init() {
        setTitle("Программа для тестов");
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JTextField jTextField = new JTextField(30);
        JButton jButton = new JButton("Отправить");
        JButton jButtonNew = new JButton("Создать");
        JLabel jLabel = new JLabel("ВВедите что хотите");
        jLabel.setFont(new Font("Verdana", Font.ITALIC, 25));
        JProgressBar jProgressBar = new JProgressBar(0, 100);
        jProgressBar.setStringPainted(true);

        Panel panel = new Panel();
        panel.add(jButton);
        panel.add(jProgressBar);

        Panel panelNorth = new Panel();
        panelNorth.add(jLabel);
        panelNorth.add(jButtonNew);


        getContentPane().add(jTextField, BorderLayout.CENTER);
        getContentPane().add(panelNorth, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.SOUTH);

        setVisible(true);

        while (true){
            try {
                jProgressBar.setValue(Integer.parseInt(jTextField.getText()));
            } catch (NumberFormatException ex) {
                System.out.println("Некорректно введено число");
            }
        }


//        for (int i = 0; i < 100; i++) {
//            jProgressBar.setValue(i);
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
