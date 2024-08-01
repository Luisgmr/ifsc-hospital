package br.edu.ifsc.hospital.view.components;

import javax.swing.*;
import java.awt.*;

public class HospitalTextInput extends HospitalPanel {

    HospitalText text;
    HospitalTextField textField;

    // text.setAlignmentX(Component.LEFT_ALIGNMENT);
    // desbuga os espaçamentos horizontais do componente nesse layout

    public HospitalTextInput(String textLabel, Integer width) {
        super(width, 60);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        text = new HospitalText(textLabel, false, 12, Color.BLACK);
        text.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(text);

        // espaçamento
        add(Box.createRigidArea(new Dimension(0, 5)));

        textField = new HospitalTextField();
        textField.setBackground(new Color(225, 225, 225));
        textField.setMaximumSize(new Dimension(getWidth(), 35));
        textField.setAlignmentX(Component.LEFT_ALIGNMENT);
        textField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 5));

        add(textField);
    }
}
