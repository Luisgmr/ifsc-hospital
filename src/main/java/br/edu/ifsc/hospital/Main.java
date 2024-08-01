package br.edu.ifsc.hospital;

import br.edu.ifsc.hospital.view.screens.Menu;

import java.awt.*;

public class Main {

    private static Menu menu;

    public static Color defaultCyan = new Color(64, 174, 186);
    public static Color defaultDarkCyan = new Color(41, 112, 118);

    public static Menu getMenu() {
        return menu;
    }

    public static void main(String[] args) {
        menu = new Menu();
    }
}