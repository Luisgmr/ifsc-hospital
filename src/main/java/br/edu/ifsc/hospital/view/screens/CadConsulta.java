package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadConsulta extends HospitalCadPanel {

    private HospitalTextInput responsavelInput = new HospitalTextInput("Responsável", 250);
    private HospitalTextInput dataHoraConsultaInput = new HospitalTextInput("Data e Hora da Consulta", 250);
    //private HospitalDateTimeInput dataHoraConsultaInput = new HospitalDateTimeInput("Data e Hora da Consulta", 250);
    private HospitalTextInput anamneseInput = new HospitalTextInput("Anamnese", 300);
    private HospitalTextInput diagnosticoInput = new HospitalTextInput("Diagnóstico", 300);
    private HospitalTextInput prescricaoInput = new HospitalTextInput("Prescrição", 300);
    private HospitalTextInput observacaoInput = new HospitalTextInput("Observação", 300);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 160);
    private HospitalTextInput medicoInput = new HospitalTextInput("Médico", 250);
    private HospitalTextInput atendimentoInput = new HospitalTextInput("Atendimento", 250);
    private HospitalTextInput receitaInput = new HospitalTextInput("Receita", 250);
    private HospitalTextInput internacaoInput = new HospitalTextInput("Internação", 250);

    public CadConsulta() {
        super("Cadastrando uma consulta");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();
        HospitalPanel line5 = generateHospitalPanelLine();
        HospitalPanel line6 = generateHospitalPanelLine();

        line1.add(responsavelInput);
        line1.add(dataHoraConsultaInput);

        line2.add(anamneseInput);
        line2.add(diagnosticoInput);

        line3.add(prescricaoInput);
        line3.add(observacaoInput);

        line4.add(statusInput);
        line4.add(medicoInput);

        line5.add(atendimentoInput);
        line5.add(receitaInput);
        line5.add(internacaoInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar consulta", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(200, 35));
        cadastrarButton.addActionListener(e -> cadastrarConsulta());

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
        add(line5);
        add(Box.createVerticalStrut(15));
        add(line6);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarConsulta() {
        // Implementar lógica de cadastro da consulta
    }
}