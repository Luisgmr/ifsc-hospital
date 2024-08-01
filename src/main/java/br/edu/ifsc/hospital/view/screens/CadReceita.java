package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadReceita extends HospitalCadPanel {

    private HospitalTextInput dataHoraReceitaInput = new HospitalTextInput("Data e Hora da Receita", 280);
    private HospitalTextInput observacaoInput = new HospitalTextInput("Observação", 350);
//    private HospitalTextAreaInput observacaoInput = new HospitalTextAreaInput("Observação", 350, 100);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Pendente", "Concluída"}, 150);

    public CadReceita() {
        super("Cadastrando uma Receita");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();

        line1.add(dataHoraReceitaInput);
        line2.add(observacaoInput);
        line3.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar receita", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarReceita());

        HospitalPanel lineButton = generateHospitalPanelLine();
        lineButton.add(cadastrarButton);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(line3);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarReceita() {
        // Implementar lógica de cadastro da receita
    }
}