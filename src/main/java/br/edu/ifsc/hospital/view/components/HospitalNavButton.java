package br.edu.ifsc.hospital.view.components;

import br.edu.ifsc.hospital.Main;
import br.edu.ifsc.hospital.view.screens.*;

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
                    case "pessoa": Main.getMenu().setMainPanel(new CadPaciente()); break;
                    case "acompanhante": Main.getMenu().setMainPanel(new CadAcompanhante()); break;
                    case "ala": Main.getMenu().setMainPanel(new CadAla()); break;
                    case "atendimento": Main.getMenu().setMainPanel(new CadAtendimento()); break;
                    case "consulta": Main.getMenu().setMainPanel(new CadConsulta()); break;
                    case "enfermeiro": Main.getMenu().setMainPanel(new CadEnfermeiro()); break;
                    case "exame": Main.getMenu().setMainPanel(new CadExame()); break;
                    case "farmaceutico": Main.getMenu().setMainPanel(new CadFarmaceutico()); break;
                    case "fornecedor": Main.getMenu().setMainPanel(new CadFornecedor()); break;
                    case "internacao": Main.getMenu().setMainPanel(new CadInternacao()); break;
                    case "jornada": Main.getMenu().setMainPanel(new CadJornada()); break;
                    case "laboratorio": Main.getMenu().setMainPanel(new CadLaboratorio()); break;
                    case "leito": Main.getMenu().setMainPanel(new CadLeito()); break;
                    case "lote": Main.getMenu().setMainPanel(new CadLote()); break;
                    case "medicamento": Main.getMenu().setMainPanel(new CadMedicamento()); break;
                    case "medico": Main.getMenu().setMainPanel(new CadMedico()); break;
                    case "prontuario": Main.getMenu().setMainPanel(new CadProntuario()); break;
                    case "quarto": Main.getMenu().setMainPanel(new CadQuarto()); break;
                    case "receita": Main.getMenu().setMainPanel(new CadReceita()); break;
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
