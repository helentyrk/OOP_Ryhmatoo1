//Ostja teeb oma valikud: 1) kontserdi pealkiri, 2) kohtade arv, 3) kuupäev.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta kuupäev kujul: päev-kuu-aasta");
        System.out.print("Sisesta kuupäev: ");
        String soovitudKuupäev = scan.nextLine();
        try {
            Date date = sdf.parse(soovitudKuupäev);
            sdf = new SimpleDateFormat("EEE, d MMM yyyy");
            System.out.println("Soovitud kuupäev: " + sdf.format(date));
        } catch (ParseException e) {
            System.out.println("Parse Exception");
        }
        return soovitudKuupäev;
    }
}
