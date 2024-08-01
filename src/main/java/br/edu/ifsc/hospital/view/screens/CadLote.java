package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadLote extends HospitalCadPanel {

    private HospitalTextInput descricaoInput = new HospitalTextInput("Descrição", 280);
    private HospitalTextInput dataFabricacaoInput = new HospitalTextInput("Data de Fabricação", 200);
    private HospitalTextInput dataValidadeInput = new HospitalTextInput("Data de Validade", 200);
//    private HospitalDatePickerInput dataFabricacaoInput = new HospitalDatePickerInput("Data de Fabricação", 200);
//    private HospitalDatePickerInput dataValidadeInput = new HospitalDatePickerInput("Data de Validade", 200);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 150);

    public CadLote() {
        super("Cadastrando um Lote");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();

        line1.add(descricaoInput);
        line2.add(dataFabricacaoInput);
        line2.add(dataValidadeInput);
        line3.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar lote", null);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarLote());

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

    private void cadastrarLote() {
        // Implementar lógica de cadastro do lote
    }
}
