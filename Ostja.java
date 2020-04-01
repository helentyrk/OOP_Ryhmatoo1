//Ostja teeb oma valikud: 1) kontserdi pealkiri, 2) kohtade arv.

import javax.swing.*;

public class Ostja {
    private String nimi;

    public Ostja(String nimi) {
        this.nimi = nimi;
    }
    public String valiKontsert() {
        String soovitudKontserdiNimi = JOptionPane.showInputDialog("Sisesta soovitud kontserdi nimi");
        return soovitudKontserdiNimi;

    }
    public int valiKohtadeArv() {
        int soovitudArv = Integer.parseInt(JOptionPane.showInputDialog("Sisesta soovitud piletite arv"));
        return soovitudArv;
    }
}
