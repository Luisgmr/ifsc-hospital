package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadQuarto extends HospitalCadPanel {

    private HospitalTextInput descricaoInput = new HospitalTextInput("Descrição", 280);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Disponível", "Ocupado", "Em Manutenção"}, 150);
    private HospitalTextInput alaInput = new HospitalTextInput("Ala", 280);

    public CadQuarto() {
        super("Cadastrando um Quarto");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();

        line1.add(descricaoInput);
        line2.add(statusInput);
        line2.add(alaInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar quarto", null);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarQuarto());

        HospitalPanel lineButton = generateHospitalPanelLine();
        lineButton.add(cadastrarButton);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarQuarto() {
        // Implementar lógica de cadastro do quarto
    }
}
