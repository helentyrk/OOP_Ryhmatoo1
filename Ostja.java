//Ostja teeb oma valikud: 1) kontserdi pealkiri, 2) kohtade arv.

import java.util.Scanner;

public class Ostja {
    private String nimi;

    public Ostja(String nimi) {
        this.nimi = nimi;
    }
   public String valiKontsert() {
        Scanner kontsert = new Scanner(System.in);
        System.out.println("Sisesta soovitud kontserdi nimi: ");
        String soovitudKontserdiNimi = kontsert.next();
        return soovitudKontserdiNimi;

    }
    public int valiKohtadeArv(){
        Scanner arv = new Scanner(System.in);
        System.out.println("Sisesta soovitud kohtade arv: ");
        int soovitudArv = arv.nextInt();
        return soovitudArv;
    }
}
