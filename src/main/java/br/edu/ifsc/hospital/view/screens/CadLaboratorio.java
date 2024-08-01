package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadLaboratorio extends HospitalCadPanel {

    private HospitalTextInput nomeFantasiaInput = new HospitalTextInput("Nome Fantasia", 280);
    private HospitalTextInput contatoInput = new HospitalTextInput("Contato", 280);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 150);

    public CadLaboratorio() {
        super("Cadastrando um Laboratório");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();

        line1.add(nomeFantasiaInput);
        line2.add(contatoInput);
        line2.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar laboratório", null);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarLaboratorio());

        HospitalPanel lineButton = generateHospitalPanelLine();
        lineButton.add(cadastrarButton);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarLaboratorio() {
        // Implementar lógica de cadastro do laboratório
    }
}