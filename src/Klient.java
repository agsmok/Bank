public class Klient {
    private long idKlient;
    private String imie;
    private String nazwisko;
    private String adres;
    private static int id = 1;
    private Konto konto;


    public Klient() {
        this.idKlient = id++;

    }

    public Klient(String imie, String nazwisko, String adres) {
        this.idKlient = id++;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public Klient(String imie, String nazwisko,double saldo) {
        this.idKlient = id++;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.konto = new Konto(saldo, idKlient);}

    public long getIdKlient() {
        return idKlient;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public double getStanKonta() {
        if (konto == null) {
            return 0;
        }
        return konto.getStanKonta();
    }
public Integer getIdKonta(){
        return konto.getIdKonta();
}

    public void setKonto(double stanKonta) {
        if (konto == null) {
            this.konto = new Konto(stanKonta, idKlient);
        }

    }

    public String toString() {
        return "id Klienta" + getIdKlient() + " imie " + getImie() + " nazwisko " + getNazwisko() + " adres " + getAdres();

    }
}

