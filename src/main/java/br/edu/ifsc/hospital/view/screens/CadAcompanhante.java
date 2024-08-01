package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadAcompanhante extends HospitalCadPanel {

    private HospitalTextInput nomeInput = new HospitalTextInput("Nome", 280);
    private HospitalTextInput grauParentescoInput = new HospitalTextInput("Grau de Parentesco", 180);
    private HospitalTextInput cpfInput = new HospitalTextInput("CPF", 180);
    private HospitalTextInput foneInput = new HospitalTextInput("Telefone", 150);
    private HospitalTextInput emailInput = new HospitalTextInput("Email", 350);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 160);

    public CadAcompanhante() {
        super("Cadastrando um acompanhante");
        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();

        line1.add(nomeInput);
        line1.add(grauParentescoInput);

        line2.add(cpfInput);
        line2.add(foneInput);

        line3.add(emailInput);
        line3.add(statusInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar acompanhante", null);
        cadastrarButton.addActionListener(e -> cadastrarAcompanhante());

        HospitalButton limparCampos = new HospitalButton("Limpar campos", Color.WHITE, Color.BLACK, Color.BLACK, Color.BLACK, null, true, 14);
        limparCampos.addActionListener(e -> Main.limparCampos(this));

        line4.add(cadastrarButton);
        line4.add(limparCampos);

        add(line1);
        add(Box.createVerticalStrut(15));
        add(line2);
        add(Box.createVerticalStrut(15));
        add(line3);
        add(Box.createVerticalStrut(15));
        add(line4);
    }

    private void cadastrarAcompanhante() {
    }
}
