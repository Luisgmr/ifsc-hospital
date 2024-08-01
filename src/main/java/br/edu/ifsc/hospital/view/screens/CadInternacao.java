package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadInternacao extends HospitalCadPanel {

    private HospitalTextInput dataHoraInternacaoInput = new HospitalTextInput("Data e Hora da Internação", 250);
    private HospitalTextInput dataHoraAltaInput = new HospitalTextInput("Data e Hora da Alta", 250);
    private HospitalTextInput observacaoInput = new HospitalTextInput("Observação", 350);
    private HospitalTextInput statusInput = new HospitalTextInput("Status", 150);
    private HospitalTextInput consultaInput = new HospitalTextInput("Consulta", 200);

    public CadInternacao() {
        super("Cadastrando uma Internação");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();

        line1.add(dataHoraInternacaoInput);
        line1.add(dataHoraAltaInput);

        line2.add(observacaoInput);

        line3.add(statusInput);
        line3.add(consultaInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar internação", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarInternacao());

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

    private void cadastrarInternacao() {
        // Implementar lógica de cadastro de internação
    }
}