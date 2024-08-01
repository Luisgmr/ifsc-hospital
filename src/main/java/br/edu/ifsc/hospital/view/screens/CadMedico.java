package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadMedico extends HospitalCadPanel {

    private HospitalTextInput nomeInput = new HospitalTextInput("Nome", 280);
    private HospitalTextInput nomeSocialInput = new HospitalTextInput("Nome Social", 280);
    private HospitalTextInput cpfCnpjInput = new HospitalTextInput("CPF", 180);
    private HospitalTextInput rgInput = new HospitalTextInput("RG", 150);
    private HospitalTextInput fonePrimarioInput = new HospitalTextInput("Fone 1", 120);
    private HospitalTextInput foneSecundarioInput = new HospitalTextInput("Fone 2", 120);
    private HospitalTextInput emailInput = new HospitalTextInput("Email", 350);
    private HospitalTextInput cidadeInput = new HospitalTextInput("Cidade", 210);
    private HospitalTextInput cepInput = new HospitalTextInput("CEP", 150);
    private HospitalTextInput bairroInput = new HospitalTextInput("Bairro", 180);
    private HospitalTextInput logradouroInput = new HospitalTextInput("Logradouro", 350);
    private HospitalTextInput complementoInput = new HospitalTextInput("Complemento", 220);
    private HospitalTextInput crmInput = new HospitalTextInput("CRM", 150);
    private HospitalTextInput loginInput = new HospitalTextInput("Login", 150);
    private HospitalTextInput senhaInput = new HospitalTextInput("Senha", 150);
//    private HospitalPasswordInput senhaInput = new HospitalPasswordInput("Senha", 150);

    public CadMedico() {
        super("Cadastrando um médico");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();
        HospitalPanel line5 = generateHospitalPanelLine();
        HospitalPanel line6 = generateHospitalPanelLine();

        line1.add(nomeInput);
        line1.add(nomeSocialInput);

        line2.add(cpfCnpjInput);
        line2.add(rgInput);
        line2.add(fonePrimarioInput);
        line2.add(foneSecundarioInput);

        line3.add(emailInput);

        line4.add(cepInput);
        line4.add(cidadeInput);
        line4.add(bairroInput);

        line5.add(logradouroInput);
        line5.add(complementoInput);

        line6.add(crmInput);
        line6.add(loginInput);
        line6.add(senhaInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar médico", Main.defaultCyan, Main.defaultCyan, Color.WHITE, Main.defaultDarkCyan, null, true, 14);
        cadastrarButton.setPreferredSize(new Dimension(250, 35));
        cadastrarButton.addActionListener(e -> cadastrarMedico());

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

    private void cadastrarMedico() {
        // Implementar lógica de cadastro do médico
    }
}