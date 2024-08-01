package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.*;

import javax.swing.*;
import java.awt.*;

public class CadAtendimento extends HospitalCadPanel {

    private HospitalTextInput pressaoInput = new HospitalTextInput("Pressão", 150);
    private HospitalTextInput temperaturaInput = new HospitalTextInput("Temperatura", 150);
    private HospitalTextInput bpmInput = new HospitalTextInput("BPM", 150);
    private HospitalTextInput oximetriaInput = new HospitalTextInput("Oximetria", 150);
    private HospitalTextInput historicoDeDoencasInput = new HospitalTextInput("Histórico de Doenças", 300);
    private HospitalTextInput alergiasInput = new HospitalTextInput("Alergias", 300);
    private HospitalTextInput medicacoesEmUsoInput = new HospitalTextInput("Medicações em Uso", 300);
    private HospitalTextInput anamneseInput = new HospitalTextInput("Anamnese", 300);
    private HospitalComboInput tipoAtendimentoInput = new HospitalComboInput("Tipo de Atendimento", new String[] {"Emergência", "Consulta", "Exame"}, 160);
    private HospitalComboInput classificacaoInput = new HospitalComboInput("Classificação", new String[] {"Verde", "Amarelo", "Vermelho"}, 160);
    private HospitalTextInput observacoesInput = new HospitalTextInput("Observações", 300);
    private HospitalComboInput statusInput = new HospitalComboInput("Status", new String[] {"Ativo", "Inativo"}, 160);

    public CadAtendimento() {
        super("Cadastrando um atendimento");

        HospitalPanel line1 = generateHospitalPanelLine();
        HospitalPanel line2 = generateHospitalPanelLine();
        HospitalPanel line3 = generateHospitalPanelLine();
        HospitalPanel line4 = generateHospitalPanelLine();
        HospitalPanel line5 = generateHospitalPanelLine();
        HospitalPanel line6 = generateHospitalPanelLine();
        HospitalPanel line7 = generateHospitalPanelLine();
        HospitalPanel line8 = generateHospitalPanelLine();

        line1.add(pressaoInput);
        line1.add(temperaturaInput);

        line2.add(bpmInput);
        line2.add(oximetriaInput);

        line3.add(historicoDeDoencasInput);

        line4.add(alergiasInput);

        line5.add(medicacoesEmUsoInput);

        line6.add(anamneseInput);

        line7.add(tipoAtendimentoInput);
        line7.add(classificacaoInput);
        line7.add(statusInput);

        line8.add(observacoesInput);

        HospitalButton cadastrarButton = new HospitalButton("Cadastrar atendimento", null);
        cadastrarButton.setPreferredSize(new Dimension(200, 35)); // Definindo tamanho para o botão
        cadastrarButton.addActionListener(e -> cadastrarAtendimento());

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
        add(line4);
        add(Box.createVerticalStrut(15));
        add(line5);
        add(Box.createVerticalStrut(15));
        add(line6);
        add(Box.createVerticalStrut(15));
        add(line7);
        add(Box.createVerticalStrut(15));
        add(line8);
        add(Box.createVerticalStrut(15));
        add(lineButton);
    }

    private void cadastrarAtendimento() {
        // Implementar lógica de cadastro do atendimento
    }
}