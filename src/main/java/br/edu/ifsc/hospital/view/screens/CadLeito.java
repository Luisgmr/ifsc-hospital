package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;
import br.edu.ifsc.hospital.view.components.subcomponents.HospitalComboBox;

import javax.swing.*;
import java.awt.*;

public class CadLeito extends HospitalCadPanel {

    private HospitalTextInput descricaoInput = new HospitalTextInput("Descrição", 280);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Disponível", "Ocupado", "Em Manutenção"}, 150);
    private HospitalTextInput quartoInput = new HospitalTextInput("Quarto", 280);

    public CadLeito() {
        super("Cadastrando um Leito");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();

        line1.add(descricaoInput);
        line2.add(statusInput);
        line2.add(quartoInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar leito", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarLeito());

        HospitalPanel lineButton = generateHospitalPanelLine();
        HospitalButton limparCampos = new HospitalButton("Limpar campos", Color.WHITE, Color.BLACK, Color.BLACK, Color.BLACK, null, true, 14);
        limparCampos.addActionListener(e -> Main.limparCampos(this));

        lineButton.add(cadastrarButton);
        lineButton.add(limparCampos);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarLeito() {
        // Implementar lógica de cadastro do leito
    }
}