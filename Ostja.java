//Ostja teeb oma valikud: 1) kontserdi pealkiri, 2) kohtade arv, 3) kuupäev.

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ostja {
    private String nimi;

    public Ostja(String nimi) {
        this.nimi = nimi;
    }
    public String getNimi() {
        return nimi;
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
    public String valiKuupäev(){
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta kuupäev kujul: päev.kuu.aasta");
        System.out.print("Sisesta kuupäev: ");
        String soovitudKuupäev = scan.nextLine();
        System.out.println("Soovitud kuupäev: " + soovitudKuupäev);
        return soovitudKuupäev;
    }
}
