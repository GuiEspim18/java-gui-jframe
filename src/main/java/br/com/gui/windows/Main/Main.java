package br.com.gui.windows.Main;

import br.com.gui.windows.Login.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    JPanel panel;

    public Main () {
        setTitle("Main window");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(new BorderLayout());
        setContentPane(this.panel);

        JButton register = new JButton("Register");
        register.setPreferredSize(new Dimension(100, 20));

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Open the register page");
            }
        });

        JButton login = new JButton("Login");
        login.setPreferredSize(new Dimension(100, 20));

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                openLogin();
                JOptionPane.showMessageDialog(Main.this, "Open the login page");
            }
        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(register);
        buttonPanel.add(login);

        panel.add(buttonPanel, BorderLayout.CENTER);

    }

    private void openLogin () {
        this.panel.removeAll();
        this.panel.add(new Login(), BorderLayout.CENTER);
        this.panel.revalidate();
        this.panel.repaint();
    }

    public void open() {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }

}
