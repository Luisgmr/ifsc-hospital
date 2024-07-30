package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.view.components.HospitalPanel;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    HospitalPanel leftPanel = new HospitalPanel(120, 768, new Color(64, 174, 186), new Color(41, 112, 118));
    HospitalPanel leftPanelButtons = new HospitalPanel(80, 300, new Color(255, 255, 255));

    public Menu() throws HeadlessException {
        init();
    }

    private void init() {
        setVisible(true);
        setTitle("Hospital");
        setSize(new Dimension(1024, 768));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        leftPanelButtons.setPosition(20);
        add(leftPanelButtons);
        add(leftPanel);


    }

}
