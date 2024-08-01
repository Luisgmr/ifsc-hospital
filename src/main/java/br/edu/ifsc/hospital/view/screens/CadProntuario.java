package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadProntuario extends HospitalCadPanel {

    private HospitalTextInput dataHoraVisitaInput = new HospitalTextInput("Data e Hora da Visita", 280);
    private HospitalTextInput descricaoVistaInput = new HospitalTextInput("Descrição da Visita", 350);
    private HospitalTextInput observacaoInput = new HospitalTextInput("Observação", 350);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Aberto", "Fechado"}, 150);
    private HospitalTextInput internacaoLeitoInput = new HospitalTextInput("Internação Leito", 280);
    private HospitalTextInput enfermeiroInput = new HospitalTextInput("Enfermeiro", 280);

    public CadProntuario() {
        super("Cadastrando um Prontuário");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();

        line1.add(dataHoraVisitaInput);
        line2.add(descricaoVistaInput);
        line3.add(observacaoInput);
        line4.add(statusInput);
        line4.add(internacaoLeitoInput);
        line4.add(enfermeiroInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar prontuário", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarProntuario());

        HospitalPanel lineButton = generateHospitalPanelLine();
        lineButton.add(cadastrarButton);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(line3);
        add(Box.createVerticalStrut(15));
        add(line4);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarProntuario() {
        // Implementar lógica de cadastro do prontuário
    }
}
