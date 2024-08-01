package br.edu.ifsc.hospital.view.components;

import javax.swing.*;
import java.awt.*;

public class HospitalText extends JLabel {


    public HospitalText(String text, Boolean isBold, Integer fontSize, Color color) {
        super(text);
        if (isBold){
            setFont(new java.awt.Font("Rethink Sans", Font.BOLD, fontSize));
        }
        else{
            setFont(new java.awt.Font("Rethink Sans", Font.PLAIN, fontSize));
        }
        setForeground(color);
        setVisible(true);
    }
}