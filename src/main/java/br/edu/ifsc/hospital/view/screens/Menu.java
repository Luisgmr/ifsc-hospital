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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu extends JFrame {

    public static HospitalPanel leftPanel = new HospitalPanel(270, 768, Main.defaultCyan, Main.defaultDarkCyan);
    static HospitalPanel leftPanelButtons = new HospitalPanel(220, 550);

    List<HospitalNavButton> listaCad = new ArrayList<>();

    HospitalPanel separador = new HospitalPanel(200, 20);
    HospitalNavButton cadPessoaNav = new HospitalNavButton("Cadastrar paciente", "pessoa.png");
    HospitalNavButton cadAcompanhanteNav = new HospitalNavButton("Cadastrar acompanhante", "acompanhante.png");
    HospitalNavButton cadMedicoNav = new HospitalNavButton("Cadastrar médico", "medico.png");
    HospitalNavButton cadMedicamento = new HospitalNavButton("Cadastrar medicamento", "medicamento.png");
    HospitalNavButton cadLote = new HospitalNavButton("Cadastrar lote", "lote.png");
    HospitalNavButton cadLeito = new HospitalNavButton("Cadastrar leito", "leito.png");
    HospitalNavButton cadQuarto = new HospitalNavButton("Cadastrar quarto", "quarto.png");
    HospitalNavButton cadAla = new HospitalNavButton("Cadastrar ala", "ala.png");
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

    HospitalPanel mainPanel = new HospitalPanel(300, 300, Color.WHITE);

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

        Main.limparCampos(this.mainPanel);
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
        listaCad.addAll(Arrays.asList(cadPessoaNav, cadAcompanhanteNav, cadAla, cadMedicoNav, cadMedicamento, cadLote, cadLeito, cadQuarto, cadConsulta, cadExame, cadReceita, cadProntuario, cadInternacao, cadLaboratorio));
        for (HospitalNavButton navButton : listaCad) {
            leftPanelButtons.add(navButton);
            navButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    for (HospitalNavButton navButton : listaCad) {
                        navButton.setColor1(null);
                    }
                    navButton.setColor1(Main.defaultDarkCyan);
                }
            });
        }

        leftPanelButtons.setPosition(25, 25);

        leftPanel.setLayout(null);

        leftPanel.add(leftPanelButtons);
        add(leftPanel);
        mainPanel.setPosition(leftPanel.getWidth(), 0);
        mainPanel.setSize(getWidth() - leftPanel.getWidth(), getHeight());

        mainPanel.add(new HospitalImage(730, 720, "telainicial.png"));

        add(mainPanel);

        System.out.println(mainPanel.getWidth() + " " + mainPanel.getHeight());

        System.out.println(leftPanel.getLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    }

}
