package br.edu.ifsc.hospital;

import br.edu.ifsc.hospital.view.components.HospitalComboInput;
import br.edu.ifsc.hospital.view.components.HospitalPanel;
import br.edu.ifsc.hospital.view.components.HospitalTextInput;
import br.edu.ifsc.hospital.view.screens.Menu;

import java.awt.*;

public class Main {

    private static Menu menu;

    public static Color defaultCyan = new Color(64, 174, 186);
    public static Color defaultDarkCyan = new Color(41, 112, 118);

    public static void limparCampos(HospitalPanel pn) {
        for (Component line : pn.getComponents()) {
            if (line instanceof HospitalPanel) {
                for (Component component : ((HospitalPanel) line).getComponents()) {
                    if (component instanceof HospitalComboInput) {
                        ((HospitalComboInput) component).limparCampo();
                    } else if (component instanceof HospitalTextInput) {
                        ((HospitalTextInput) component).limparCampo();
                    }
                }
            }
        }
    }

    public static Menu getMenu() {
        return menu;
    }

    public static void main(String[] args) {
        menu = new Menu();
    }
}