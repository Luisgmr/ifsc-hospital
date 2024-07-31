package br.edu.ifsc.hospital.view.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
    }

}
