package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadExame extends HospitalCadPanel {

    private HospitalTextInput tituloExameInput = new HospitalTextInput("Título do Exame", 280);
    private HospitalTextInput tipoExameInput = new HospitalTextInput("Tipo de Exame", 280);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 150);

    public CadExame() {
        super("Cadastrando um Exame");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();

        line1.add(tituloExameInput);
        line1.add(tipoExameInput);

        line2.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar exame", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(200, 35));
        cadastrarButton.addActionListener(e -> cadastrarExame());

        HospitalPanel lineButton = generateHospitalPanelLine();
        lineButton.add(cadastrarButton);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarExame() {
        // Implementar lógica de cadastro do exame
    }
}