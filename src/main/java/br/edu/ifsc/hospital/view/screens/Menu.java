package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.view.components.HospitalImage;
import br.edu.ifsc.hospital.view.components.HospitalNavButton;
import br.edu.ifsc.hospital.view.components.HospitalPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Menu extends JFrame {

    HospitalPanel leftPanel = new HospitalPanel(250, 768, new Color(64, 174, 186), new Color(41, 112, 118));
    HospitalPanel leftPanelButtons = new HospitalPanel(200, 465);

    HospitalPanel cadPessoaNav = new HospitalNavButton("Cadastrar pessoa", "pessoa.png");
    HospitalPanel cadAcompanhanteNav = new HospitalNavButton("Cadastrar acompanhante", "acompanhante.png");
    HospitalPanel cadMedicoNav = new HospitalNavButton("Cadastrar médico", "medico.png");
    HospitalPanel cadMedicamento = new HospitalNavButton("Cadastrar medicamento", "medicamento.png");
    HospitalPanel cadLote = new HospitalNavButton("Cadastrar lote", "lote.png");
    HospitalPanel cadLeito = new HospitalNavButton("Cadastrar leito", "leito.png");
    HospitalPanel cadQuarto = new HospitalNavButton("Cadastrar quarto", "quarto.png");
    HospitalPanel cadConsulta = new HospitalNavButton("Cadastrar consulta", "consulta.png");
    HospitalPanel cadExame = new HospitalNavButton("Cadastrar exame", "exame.png");
    HospitalPanel cadReceita = new HospitalNavButton("Cadastrar receita", "receita.png");
    HospitalPanel cadProntuario = new HospitalNavButton("Cadastrar prontuario", "prontuario.png");
    HospitalPanel cadInternacao = new HospitalNavButton("Cadastrar internação", "internacao.png");
    HospitalPanel cadLaboratorio = new HospitalNavButton("Cadastrar laboratório", "laboratorio.png");

    public Menu() throws HeadlessException {
        init();
    }

    private void init() {
        setVisible(true);
        setTitle("Hospital");
        setSize(new Dimension(1024, 768));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        leftPanelButtons.add(new HospitalImage(64, 64, "hospital.png", Color.WHITE));
        leftPanelButtons.add(cadPessoaNav);
        leftPanelButtons.add(cadAcompanhanteNav);
        leftPanelButtons.add(cadMedicoNav);
        leftPanelButtons.add(cadMedicamento);
        leftPanelButtons.add(cadLote);
        leftPanelButtons.add(cadLeito);
        leftPanelButtons.add(cadQuarto);
        leftPanelButtons.add(cadConsulta);
        leftPanelButtons.add(cadExame);
        leftPanelButtons.add(cadReceita);
        leftPanelButtons.add(cadProntuario);
        leftPanelButtons.add(cadInternacao);
        leftPanelButtons.add(cadLaboratorio);
        leftPanelButtons.add(cadReceita);

        leftPanelButtons.setPosition(25, 0);
        add(leftPanelButtons);
        add(leftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    }

}
