package br.edu.ifsc.hospital.view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class HospitalButton extends JButton {
    private Color textColor = Color.BLACK; // Cor do texto
    private Color hoverBackgroundColor; // Cor de fundo ao passar o mouse
    private Color originalBackgroundColor; // Cor de fundo original
    private Color hoverBorderColor; // Cor da borda ao passar o mouse
    private Color originalBorderColor; // Cor da borda original
    private Boolean isBorderRadius = true;

    public HospitalButton(String texto, Color corFundo, Color corBorda, Color corTexto, Color hoverCorFundo, Dimension tamanho) {
        setVisible(true);
        setText(texto);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBackground(corFundo); // COR DO FUNDO
        setForeground(corBorda); // COR DA BORDA
        setTextColor(corTexto);  // COR DO TEXTO
        setFont(new java.awt.Font("Rethink Sans", Font.PLAIN, 20));
        if (tamanho == null) {
            setPreferredSize(new Dimension(200, 35));
        } else {
            setPreferredSize(tamanho);
        }
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        this.originalBackgroundColor = corFundo;
        this.hoverBackgroundColor = hoverCorFundo;
        this.originalBorderColor = corBorda;
        this.hoverBorderColor = hoverCorFundo;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverBackgroundColor);
                setForeground(hoverBorderColor);
                setTextColor(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(originalBackgroundColor);
                setForeground(originalBorderColor);
                setTextColor(corTexto);
            }
        });
    }

    public HospitalButton(String texto, Color corFundo, Color corBorda, Color corTexto, Color hoverCorFundo, Dimension tamanho, Boolean isBorderRadius, Integer fontSize) {
        setVisible(true);
        setText(texto);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBackground(corFundo); // COR DO FUNDO
        setForeground(corBorda); // COR DA BORDA
        setTextColor(corTexto);  // COR DO TEXTO
        setFont(new java.awt.Font("Rethink Sans", Font.PLAIN, fontSize));
        if (tamanho == null) {
            setPreferredSize(new Dimension(200, 35));
        } else {
            setPreferredSize(tamanho);
        }
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        this.originalBackgroundColor = corFundo;
        this.hoverBackgroundColor = hoverCorFundo;
        this.originalBorderColor = corBorda;
        this.hoverBorderColor = hoverCorFundo;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverBackgroundColor);
                setForeground(hoverBorderColor);
                setTextColor(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(originalBackgroundColor);
                setForeground(originalBorderColor);
                setTextColor(corTexto);
            }
        });
        this.isBorderRadius = isBorderRadius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());

        Shape roundedRect;
        if (this.isBorderRadius){
          roundedRect = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 15, 15);
        }
        else{
          roundedRect = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 0, 0);
        }


        g2.fill(roundedRect);

        g2.setColor(textColor);
        g2.setFont(getFont());
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
        g2.drawString(getText(), x, y);

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getForeground());

        Shape roundedRect = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);

        g2.draw(roundedRect);

        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        Shape roundedRect = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 20, 20);
        return roundedRect.contains(x, y);
    }

    public void setTextColor(Color color) {
        this.textColor = color;
        repaint();
    }

    public void addActionListener(ActionListener listener) {
        super.addActionListener(listener);
    }
}