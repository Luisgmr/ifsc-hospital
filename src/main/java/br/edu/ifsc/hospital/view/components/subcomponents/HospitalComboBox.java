package br.edu.ifsc.hospital.view.components.subcomponents;

import br.edu.ifsc.hospital.Main;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.*;

public class HospitalComboBox extends JComboBox {

    public HospitalComboBox(Object[] items) {
        super(items);
        // Definindo a cor de fundo e removendo a borda padrão
        setBackground(new Color(225, 225, 225));
        setForeground(Color.BLACK);
        setOpaque(false);
        setUI(new CustomComboBoxUI());
        setRenderer(new CustomListCellRenderer());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // antialiasing para texto
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

        // Pintar o fundo
        g2d.setColor(new Color(225, 225, 225));
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Pintar o texto
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Rethink Sans", Font.PLAIN, 13));
        String text = getSelectedItem() != null ? getSelectedItem().toString() : "";
        g2d.drawString(text, 10, getHeight() / 2 + g.getFontMetrics().getAscent() / 2 - 2);

        g2d.dispose();
    }

    @Override
    public void setBorder(Border border) {
        // Sobrescrever para evitar que a borda seja definida
    }

    private class CustomComboBoxUI extends BasicComboBoxUI {

        @Override
        protected void installDefaults() {
            super.installDefaults();
            comboBox.setOpaque(false);
        }

        @Override
        public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
            // Não pintar a borda do valor atual
        }

        @Override
        protected JButton createArrowButton() {
            JButton button = new JButton() {
                @Override
                public void paint(Graphics g) {
                    super.paint(g);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                    int x = getWidth() / 2;
                    int y = getHeight() / 2;
                    int size = 5;

                    g2d.setColor(Color.DARK_GRAY);
                    int[] xPoints = { x - size, x + size, x };
                    int[] yPoints = { y - size, y - size, y + size };
                    g2d.fillPolygon(xPoints, yPoints, 3);

                    g2d.dispose();
                }
            };
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            return button;
        }

        @Override
        protected ComboPopup createPopup() {
            return new CustomComboPopup(comboBox);
        }
    }

    private class CustomComboPopup extends BasicComboPopup {
        public CustomComboPopup(JComboBox<Object> combo) {
            super(combo);
        }

        @Override
        public void show(Component invoker, int x, int y) {
            super.show(invoker, x, y - 1); // Ajuste a posição Y para mover o popup
        }

        @Override
        protected void configurePopup() {
            super.configurePopup();
            setBorder(new CustomPopupBorder());
        }
    }

    private class CustomPopupBorder implements Border {
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.GRAY);
            g.drawRect(x, y, width - 1, height - 1); // Desenhar a borda nas laterais e na parte inferior
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(1, 1, 1, 1); // Definir a espessura das bordas
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }

    private class CustomListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (isSelected) {
                label.setBackground(Main.defaultCyan);
                label.setForeground(Color.WHITE);
            } else {
                label.setBackground(new Color(237, 237, 237));
                label.setForeground(Color.BLACK);
            }

            label.setFont(new Font("Rethink Sans", Font.PLAIN, 13));
            label.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

            return label;
        }
    }

}
