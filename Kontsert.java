public class Kontsert {
    private String kontserdiPealkiri;
    private String toimumiseKoht;
    private String toimumiseAeg;
    private int müüdavatePiletiteArv;
    private int piletiHind;

    public Kontsert(String kontserdiPealkiri, String toimumiseKoht, String toimumiseAeg, int müüdavatePiletiteArv, int piletiHind) {
        this.kontserdiPealkiri = kontserdiPealkiri;
        this.toimumiseKoht = toimumiseKoht;
        this.toimumiseAeg = toimumiseAeg;
        this.müüdavatePiletiteArv = müüdavatePiletiteArv;
        this.piletiHind = piletiHind;
    }

    public String getKontserdiPealkiri() {
        return kontserdiPealkiri;
    }

    public void setKontserdiPealkiri(String kontserdiPealkiri) {
        this.kontserdiPealkiri = kontserdiPealkiri;
    }

    public String getToimumiseAeg() {
        return toimumiseAeg;
    }

    public void setToimumiseAeg(String toimumiseAeg) {
        this.toimumiseAeg = toimumiseAeg;
    }

    public int getMüüdavatePiletiteArv() {
        return müüdavatePiletiteArv;
    }

    public void setMüüdavatePiletiteArv(int müüdavatePiletiteArv) {
        this.müüdavatePiletiteArv = müüdavatePiletiteArv;
    }


    @Override
    public String toString() {
        return "Kontserdi " + kontserdiPealkiri + " toimumiskoht on " + toimumiseKoht + ", piletihind on " + piletiHind + "eurot, kokku müüakse kontserdile " + müüdavatePiletiteArv + " piletit.";
    }
}
