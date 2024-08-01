package br.edu.ifsc.hospital.view.components;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.screens.Menu;

import javax.swing.*;
import java.awt.*;

public class HospitalCadPanel extends HospitalPanel {

    public HospitalPanel generateHospitalPanelLine() {
        HospitalPanel line = new HospitalPanel(getWidth(), 60);
        line.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 0));
        line.setMaximumSize(new Dimension(700, line.getHeight()));
        return line;
    }
    public HospitalPanel generateHospitalPanelLine(Integer height) {
        HospitalPanel line = new HospitalPanel(getWidth(), height);
        line.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 0));
        line.setMaximumSize(new Dimension(700, line.getHeight()));
        return line;
    }

    public HospitalCadPanel(String tituloTexto) {
        super(Main.getMenu().getWidth() - Menu.leftPanel.getWidth(), Main.getMenu().getHeight(), Color.WHITE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // padding
        setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20));

        HospitalText titulo = new HospitalText(tituloTexto, true, 15, Color.BLACK);
        HospitalPanel line1 = generateHospitalPanelLine(20);
        line1.add(titulo);
        add(line1);
        add(Box.createVerticalStrut(15));
    }
}
