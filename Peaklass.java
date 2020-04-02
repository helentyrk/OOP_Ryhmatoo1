import java.util.*;

public class Peaklass {

    public static void main(String[] args) {
        //Valikus olevad kontserdid ja nende massiiv ning uus ostja
        Kontsert kontsert1 = new Kontsert("Päike", "Vanemuise kontserdisaal", "02-04-2020", 35, 15);
        Kontsert kontsert2 = new Kontsert("Rahu", "Viljandi Pärimusmuusika Ait", "30-04-2020", 20, 13);
        Kontsert[] kontserdid = {kontsert1, kontsert2};
        Ostja ostja1 = new Ostja("Mari");

        //Programmi tutvustav tekst
        System.out.println("Tere tulemast, " + ostja1.getNimi() + "! Selle programmi abil saab osta kontsertide pileteid.");
        System.out.println("Hetkel on valikus sellised kontserdid: " + kontsert1.getKontserdiPealkiri() + " , " + kontsert2.getKontserdiPealkiri() + ".");

        //Ostja valib kontserdi meetodiga 'valiKontsert', esialgu paneme "valitud kontserdi" väärtuseks näiteks esimese kontserdi.
        String valitudPealkiri = ostja1.valiKontsert();
        Kontsert valitudKontsert = kontsert1;

        //Programm vaatab, kas selline kontsert on valikus ja kui on, siis kinnitab valiku.
        List<String> pealkirjad = new ArrayList<String>();

        for (Kontsert k : kontserdid) {
            String pealk = k.getKontserdiPealkiri();
            pealkirjad.add(pealk);
        }
        while (!pealkirjad.contains(valitudPealkiri)) {
            System.out.println("Sellist kontserti valikus ei ole. Palun vali uuesti.");
            valitudPealkiri = ostja1.valiKontsert();
        }
            if (pealkirjad.contains(valitudPealkiri)) {
                for (Kontsert k : kontserdid) {
                    String pealk = k.getKontserdiPealkiri();
                    if (valitudPealkiri.equals(pealk)) {
                        valitudKontsert = k;
                    }
                }
                System.out.println(valitudKontsert.toString());
            }
        //Vaatan konkreetse konserdi kohtade arvu suurust ja loon vastava massiivi
        int kohtadeArv = valitudKontsert.getMüüdavatePiletiteArv();
        int[] kohad = new int[kohtadeArv];
        for (int i = 0; i < kohtadeArv; i++) {
            kohad[i] = i + 1;
        }
        //Soovitud piletite arvu küsimine
        int soovitudPiletiteArv = ostja1.valiKohtadeArv();

        while (soovitudPiletiteArv > valitudKontsert.getMüüdavatePiletiteArv()){
            System.out.println("Soovitud piletite arv ületab müüdavate piletite arvu. Vabu kohti on " + valitudKontsert.getMüüdavatePiletiteArv()+ ". Palun vali uuesti.");
            soovitudPiletiteArv = ostja1.valiKohtadeArv();
        }
        System.out.println("Soovitud pileteid: " + soovitudPiletiteArv);

        //Soovitud kuupäeva küsimine
        String soovitudKuupäev = ostja1.valiKuupäev();
        System.out.println("Soovitud kuupäev: " + soovitudKuupäev);

        //Loon müüdud kohtade listi, et näha, palju kokku on kohti müüdud.
        List<Integer> kohtadeList = new ArrayList<>();

        //Kas soovitakse kohta valida või tuleb juhuslikult genereerida?
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Kui soovite kohta valida järjest, siis vastake jah, kui soovite juhuslikke kohti, siis vastake ei.");
        String valik = scan4.next();
        System.out.println(valik);

        if (valik.equals("jah")) {
            for (int i = 0; i < soovitudPiletiteArv; i++) {
                if (soovitudPiletiteArv < kohtadeArv) {
                    int soovitudKoht = kohad[i];
                    kohtadeList.add(soovitudKoht);
                    System.out.println("Pakutud koht on: " + soovitudKoht);
                }
            }
        } else if (valik.equals("ei")) {
            List<Integer> juhuslikKoht = new ArrayList<>();
            for (int i = 0; i < kohad.length; i++) {
                juhuslikKoht.add(i + 1);
            }
                Collections.shuffle(juhuslikKoht);
                for (int j = 0; j < soovitudPiletiteArv; j++) {
                    int juhuKohad = juhuslikKoht.get(j);
                    System.out.println("Juhuslikult pakutud koht on: " + juhuKohad);
                    kohtadeList.add(juhuKohad);
                }
        }
        //Arvutame müüdud piletite maksumuse, anname ostjale teada ja täname ostu eest.
        Piletimüük piletimüük1 = new Piletimüük(valitudKontsert, valitudKontsert.getPiletiHind());
        int ostetudPiletid = piletimüük1.piletiteMaksumus(valitudKontsert.getPiletiHind(), kohtadeList.size());
        System.out.println("Piletite maksumus on kokku " + ostetudPiletid + " eurot. Täname ostu eest!");

        //Teeme kohtade listi String tüüpi muutujateks ja prindime välja hõivatud kohad.
        Collections.sort(kohtadeList);
        List<String> kohadStringiks = new ArrayList<>();
        for(Integer koht :  kohtadeList) {
            kohadStringiks.add(String.valueOf(koht));
        }
        String võetudKohad = String.join(", ", kohadStringiks);
        System.out.println("Kontserdil on nüüd hõivatud kohad " + võetudKohad + ".");
    }
}
