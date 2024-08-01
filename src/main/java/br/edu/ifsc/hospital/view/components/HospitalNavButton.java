package br.edu.ifsc.hospital.view.components;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.screens.CadAcompanhante;
import br.edu.ifsc.hospital.view.screens.CadPaciente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HospitalNavButton extends HospitalPanel {

    public HospitalNavButton(String textoLabel, String iconeArquivo) {
        super(200, 30);
        HospitalImage icone = new HospitalImage(16, 16, iconeArquivo, Color.WHITE);
        JLabel texto = new JLabel(textoLabel);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Rethink Sans", 1, 15));

        add(icone);
        add(texto);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        String nomeTelaCadastro = iconeArquivo.replace(".png", "");
        // Adicionando MouseListener para tornar o botão clicável
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Ação a ser executada ao clicar no botão
                System.out.println(textoLabel + " clicado!");
                switch (nomeTelaCadastro) {
                    case "pessoa":
                        Main.getMenu().setMainPanel(new CadPaciente());
                        break;
                    case "acompanhante":
                        Main.getMenu().setMainPanel(new CadAcompanhante());
                        break;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR)); // Mudar o cursor ao passar o mouse
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Restaurar o cursor ao sair
            }
        });
    }

}
