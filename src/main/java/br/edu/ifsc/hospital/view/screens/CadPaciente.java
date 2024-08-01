package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadPaciente extends HospitalCadPanel {

    private HospitalTextInput nomeInput = new HospitalTextInput("Nome", 280);
    private HospitalTextInput nomeSocialInput = new HospitalTextInput("Nome social", 280);
    private HospitalComboInput tipoSanguineoInput = new HospitalComboInput("Tipo sanguíneo", new String[] {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}, 95);
    private HospitalComboInput sexoInput = new HospitalComboInput("Sexo", new String[] {"Masculino", "Feminino"}, 160);
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

    public CadPaciente() {
        super("Cadastrando um paciente");
        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();
        HospitalPanel line5 = generateHospitalPanelLine();
        HospitalPanel line6 = generateHospitalPanelLine();

        line1.add(nomeInput);
        line1.add(nomeSocialInput);

        line2.add(sexoInput);
        line2.add(tipoSanguineoInput);
        line2.add(cpfCnpjInput);
        line2.add(rgInput);

        line3.add(emailInput);
        line3.add(fonePrimarioInput);
        line3.add(foneSecundarioInput);

        line4.add(cepInput);
        line4.add(cidadeInput);
        line4.add(bairroInput);

        line5.add(logradouroInput);
        line5.add(complementoInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar paciente", null);

        HospitalButton limparCampos = new HospitalButton("Limpar campos", Color.WHITE, Color.BLACK, Color.BLACK, Color.BLACK, null, true, 14);
        limparCampos.addActionListener(e -> Main.limparCampos(this));

        line6.add(cadastrarButton);
        line6.add(limparCampos);

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
    }
}
