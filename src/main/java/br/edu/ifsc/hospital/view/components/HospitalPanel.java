package br.edu.ifsc.hospital.view.components;

import javax.swing.*;
import java.awt.*;

public class HospitalPanel extends JPanel {

    private Color color1;
    private Color color2;

    public HospitalPanel(Integer width, Integer height, Color bgColor) {
        setVisible(true);
        setPreferredSize(new Dimension(width, height));
        setSize(width, height);
        this.color1 = bgColor;
        this.color2 = null;
        setPosition(0, 0);
    }

    public HospitalPanel(Integer width, Integer height, Color bgColor1, Color bgColor2) {
        setVisible(true);
        setPreferredSize(new Dimension(width, height));
        this.color1 = bgColor1;
        this.color2 = bgColor2;
        setPosition(0, 0);
    }

    public HospitalPanel(Integer width, Integer height) {
        setVisible(true);
        setPreferredSize(new Dimension(width, height));
        setPosition(0, 0);
    }

    public void setPosition(Integer x, Integer y) {
        setBounds(x, y, getPreferredSize().width, getPreferredSize().height);
    }


    @Override
    protected void paintComponent(Graphics g) {
        if (color1 == null) return;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        if (color2 == null || color1.equals(color2)) {
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        } else {
            GradientPaint gp = new GradientPaint(0, 0, color1, 0, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
        }
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
        repaint();
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        repaint();
    }
}
