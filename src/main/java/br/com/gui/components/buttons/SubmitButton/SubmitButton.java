package br.com.gui.components.buttons.SubmitButton;

import br.com.gui.utils.interfaces.JComponent;
import br.com.gui.utils.styles.Colors.Colors;

import javax.swing.*;
import java.awt.*;

public class SubmitButton extends JButton implements JComponent {

    public SubmitButton(String text) {
        super(text);

    }

    public void configure() {
        setBackground(Color.decode(Colors.MAIN_BLUE));
        setForeground(Color.decode(Colors.MAIN_WHITE));
    }

}
