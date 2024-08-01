package br.edu.ifsc.hospital.view.screens;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.components.HospitalImage;
import br.edu.ifsc.hospital.view.components.HospitalNavButton;
import br.edu.ifsc.hospital.view.components.HospitalPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Menu extends JFrame {

    public static HospitalPanel leftPanel = new HospitalPanel(250, 768, Main.defaultCyan, Main.defaultDarkCyan);
    static HospitalPanel leftPanelButtons = new HospitalPanel(200, 550);

    HospitalPanel separador = new HospitalPanel(200, 20);
    HospitalNavButton cadPessoaNav = new HospitalNavButton("Cadastrar paciente", "pessoa.png");
    HospitalNavButton cadAcompanhanteNav = new HospitalNavButton("Cadastrar acompanhante", "acompanhante.png");
    HospitalNavButton cadMedicoNav = new HospitalNavButton("Cadastrar médico", "medico.png");
    HospitalNavButton cadMedicamento = new HospitalNavButton("Cadastrar medicamento", "medicamento.png");
    HospitalNavButton cadLote = new HospitalNavButton("Cadastrar lote", "lote.png");
    HospitalNavButton cadLeito = new HospitalNavButton("Cadastrar leito", "leito.png");
    HospitalNavButton cadQuarto = new HospitalNavButton("Cadastrar quarto", "quarto.png");
    HospitalNavButton cadConsulta = new HospitalNavButton("Cadastrar consulta", "consulta.png");
    HospitalNavButton cadExame = new HospitalNavButton("Cadastrar exame", "exame.png");
    HospitalNavButton cadReceita = new HospitalNavButton("Cadastrar receita", "receita.png");
    HospitalNavButton cadProntuario = new HospitalNavButton("Cadastrar prontuario", "prontuario.png");
    HospitalNavButton cadInternacao = new HospitalNavButton("Cadastrar internação", "internacao.png");
    HospitalNavButton cadLaboratorio = new HospitalNavButton("Cadastrar laboratório", "laboratorio.png");

    private static HospitalNavButton navButtonSelected = null;

    public static void setNavButtonSelected(HospitalNavButton navButtonSelected) {
        Menu.navButtonSelected = navButtonSelected;
    }

    HospitalPanel mainPanel = new HospitalPanel(300, 300, Color.RED);

    public void setMainPanel(HospitalPanel mainPanel) {
        // Remove o painel anterior se existir
        if (this.mainPanel != null) {
            remove(this.mainPanel);
        }

        // Define o novo painel principal
        this.mainPanel = mainPanel;
        this.mainPanel.setPosition(leftPanel.getWidth(), 0);
        this.mainPanel.setSize(getWidth() - leftPanel.getWidth(), getHeight());

        // Adiciona o novo painel
        add(this.mainPanel);

        // Revalida e repinta para atualizar a interface
        revalidate();
        repaint();
    }

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
        leftPanelButtons.add(separador);

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

        leftPanelButtons.setPosition(25, 25);

        leftPanel.setLayout(null);

        leftPanel.add(leftPanelButtons);
        add(leftPanel);
        mainPanel.setPosition(leftPanel.getWidth(), 0);
        mainPanel.setSize(getWidth() - leftPanel.getWidth(), getHeight());
        add(mainPanel);

        System.out.println(mainPanel.getWidth() + " " + mainPanel.getHeight());

        System.out.println(leftPanel.getLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    }
}
