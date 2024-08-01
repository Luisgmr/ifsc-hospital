package br.edu.ifsc.hospital.view.components;

import br.edu.ifsc.hospital.view.components.subcomponents.HospitalComboBox;

import javax.swing.*;
import java.awt.*;

public class HospitalComboInput extends HospitalPanel {

    HospitalText text;
    HospitalComboBox comboBox;

    // text.setAlignmentX(Component.LEFT_ALIGNMENT);
    // desbuga os espaçamentos horizontais do componente nesse layout

    public HospitalComboInput(String textLabel, String[] items, Integer width) {
        super(width, 60);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        text = new HospitalText(textLabel, false, 12, Color.BLACK);
        text.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(text);

        // espaçamento
        add(Box.createRigidArea(new Dimension(0, 5)));

        comboBox = new HospitalComboBox(items);
        comboBox.setBackground(new Color(225, 225, 225));
        comboBox.setMaximumSize(new Dimension(getWidth(), 35));
        comboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        comboBox.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));

        add(comboBox);
    }

    public void limparCampo(){
        comboBox.setSelectedIndex(-1);
    }
}
