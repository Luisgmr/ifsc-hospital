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
        HospitalPanel line3 = generateHospitalPanelLine();

        line1.add(descricaoInput);
        line2.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar ala", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(160, 35)); // Definindo tamanho para o botão
        cadastrarButton.addActionListener(e -> cadastrarAla());

        line3.add(cadastrarButton);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(line3);
    }

    private void cadastrarAla() {
        // Implementar lógica de cadastro da ala
    }
}