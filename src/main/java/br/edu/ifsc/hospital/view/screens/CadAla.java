package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadAla extends HospitalCadPanel {

    private HospitalTextInput descricaoInput = new HospitalTextInput("Descrição", 280);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 160);

    public CadAla() {
        super("Cadastrando uma ala");
        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();

        line1.add(descricaoInput);
        line2.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar ala", null);
        cadastrarButton.setPreferredSize(new Dimension(160, 35)); // Definindo tamanho para o botão
        cadastrarButton.addActionListener(e -> cadastrarAla());

        HospitalButton limparCampos = new HospitalButton("Limpar campos", Color.WHITE, Color.BLACK, Color.BLACK, Color.BLACK, null, true, 14);
        HospitalPanel lineButton = generateHospitalPanelLine();
        limparCampos.addActionListener(e -> Main.limparCampos(this));

        lineButton.add(cadastrarButton);
        lineButton.add(limparCampos);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarAla() {
        // Implementar lógica de cadastro da ala
    }
}