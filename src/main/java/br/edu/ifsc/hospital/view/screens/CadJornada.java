package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadJornada extends HospitalCadPanel {

    private HospitalTextInput dataInicialInput = new HospitalTextInput("Data Inicial", 250);
    private HospitalTextInput cargaHorariaInput = new HospitalTextInput("Carga Horária (horas)", 150);
    private HospitalTextInput medicoInput = new HospitalTextInput("Médico", 250);
    private HospitalTextInput enfermeiroInput = new HospitalTextInput("Enfermeiro", 250);
    private HospitalTextInput farmaceuticoInput = new HospitalTextInput("Farmacêutico", 250);

    public CadJornada() {
        super("Cadastrando uma Jornada");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();

        line1.add(dataInicialInput);
        line1.add(cargaHorariaInput);

        line2.add(medicoInput);
        line2.add(enfermeiroInput);

        line3.add(farmaceuticoInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar jornada", null);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarJornada());

        HospitalPanel lineButton = generateHospitalPanelLine();
        HospitalButton limparCampos = new HospitalButton("Limpar campos", Color.WHITE, Color.BLACK, Color.BLACK, Color.BLACK, null, true, 14);
        limparCampos.addActionListener(e -> Main.limparCampos(this));

        lineButton.add(cadastrarButton);
        lineButton.add(limparCampos);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(line3);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarJornada() {
        // Implementar lógica de cadastro de jornada
    }
}