package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadMedicamento extends HospitalCadPanel {

    private HospitalTextInput descricaoMedicamentoInput = new HospitalTextInput("Descrição do Medicamento", 280);
    private HospitalTextInput principioAtivoInput = new HospitalTextInput("Princípio Ativo", 280);
    private HospitalTextInput qtdMinimaInput = new HospitalTextInput("Quantidade Mínima", 150);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 150);

    public CadMedicamento() {
        super("Cadastrando um Medicamento");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();

        line1.add(descricaoMedicamentoInput);
        line2.add(principioAtivoInput);
        line2.add(qtdMinimaInput);
        line3.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar medicamento", null);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarMedicamento());

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

    private void cadastrarMedicamento() {
        // Implementar lógica de cadastro do medicamento
    }
}
