package br.com.gui.components.buttons.SubmitButton;

import br.com.gui.utils.interfaces.JComponent;
import br.com.gui.utils.styles.Colors.Colors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitButton extends JButton implements JComponent {

    public SubmitButton(String text) {
        super(text);
        configure();
    }

    public void configure() {
        setOpaque(true);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(Color.decode(Colors.MAIN_BLUE));
        setForeground(Color.decode(Colors.MAIN_WHITE));
        setFont(new Font("Arial", Font.BOLD, 14));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public void onClick (Runnable runnable) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runnable.run();
            }
        });
    }
}
