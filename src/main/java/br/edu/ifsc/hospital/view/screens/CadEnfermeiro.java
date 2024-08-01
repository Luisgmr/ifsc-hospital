package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadEnfermeiro extends HospitalCadPanel {

    private HospitalTextInput nomeInput = new HospitalTextInput("Nome", 280);
    private HospitalTextInput nomeSocialInput = new HospitalTextInput("Nome Social", 280);
    private HospitalTextInput cpfCnpjInput = new HospitalTextInput("CPF/CNPJ", 180);
    private HospitalTextInput rgInscricaoEstadualInput = new HospitalTextInput("RG/Inscrição Estadual", 180);
    private HospitalTextInput fone1Input = new HospitalTextInput("Fone 1", 180);
    private HospitalTextInput fone2Input = new HospitalTextInput("Fone 2", 180);
    private HospitalTextInput emailInput = new HospitalTextInput("Email", 280);
    private HospitalTextInput cepInput = new HospitalTextInput("CEP", 120);
    private HospitalTextInput cidadeInput = new HospitalTextInput("Cidade", 180);
    private HospitalTextInput bairroInput = new HospitalTextInput("Bairro", 180);
    private HospitalTextInput logradouroInput = new HospitalTextInput("Logradouro", 280);
    private HospitalTextInput complementoInput = new HospitalTextInput("Complemento", 280);
    private HospitalTextInput creInput = new HospitalTextInput("CRE", 180);
    private HospitalTextInput loginInput = new HospitalTextInput("Login", 180);
    private HospitalTextInput senhaInput = new HospitalTextInput("Senha", 180);
    //private HospitalPasswordInput senhaInput = new HospitalPasswordInput("Senha", 180);

    public CadEnfermeiro() {
        super("Cadastrando um enfermeiro");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();
        HospitalPanel line5 = generateHospitalPanelLine();
        HospitalPanel line6 = generateHospitalPanelLine();
        HospitalPanel line7 = generateHospitalPanelLine();

        line1.add(nomeInput);
        line1.add(nomeSocialInput);

        line2.add(cpfCnpjInput);
        line2.add(rgInscricaoEstadualInput);

        line3.add(fone1Input);
        line3.add(fone2Input);
        line3.add(emailInput);

        line4.add(cepInput);
        line4.add(cidadeInput);
        line4.add(bairroInput);

        line5.add(logradouroInput);
        line5.add(complementoInput);

        line6.add(creInput);
        line6.add(loginInput);
        line6.add(senhaInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar enfermeiro", null);
        cadastrarButton.setPreferredSize(new Dimension(200, 35));
        cadastrarButton.addActionListener(e -> cadastrarEnfermeiro());

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
        add(line7);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarEnfermeiro() {
        // Implementar lógica de cadastro do enfermeiro
    }
}