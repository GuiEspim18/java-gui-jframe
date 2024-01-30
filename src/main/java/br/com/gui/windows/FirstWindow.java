package br.com.gui.windows;

import javax.swing.*;

public class FirstWindow extends JFrame {

    public FirstWindow () {
        setTitle("My first window");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!");
        add(label);
    }

    public void run() {
        SwingUtilities.invokeLater(() -> {
            FirstWindow window =  new FirstWindow();
            window.setVisible(true);
        });
    }

}
