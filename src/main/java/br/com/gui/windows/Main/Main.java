package br.com.gui.windows.Main;

import br.com.gui.components.buttons.SubmitButton.SubmitButton;
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

        SubmitButton register = new SubmitButton("Register");
        register.setPreferredSize(new Dimension(120, 30));

        register.onClick(() -> {

        });

        SubmitButton login = new SubmitButton("Login");
        login.setPreferredSize(new Dimension(120, 30));

        login.onClick(() -> {

        });


        JPanel buttonPanel = new JPanel(new FlowLayout());
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
