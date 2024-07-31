package br.edu.ifsc.hospital.view.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HospitalImage extends JLabel {

    public HospitalImage(Integer width, Integer height, String nomeArquivo, Color color) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/main/java/br/edu/ifsc/hospital/view/resource/icons/" + nomeArquivo));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Graphics g = img.getGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int rgba = img.getRGB(x, y);
                Color col = new Color(rgba, true);
                if (col.getAlpha() > 0) {
                    img.setRGB(x, y, color.getRGB());
                }
            }
        }


        Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(scaledImage);



        setIcon(imageIcon);
    }

    public HospitalImage(Integer width, Integer height, String nomeArquivo) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/main/java/br/edu/ifsc/hospital/view/resource/icons/" + nomeArquivo));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(scaledImage);
        setIcon(imageIcon);
    }

}
