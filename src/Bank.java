import java.util.HashMap;
import java.util.Map;

public class Bank {
   private double stanKontaBanku=10000000;

  Map<Integer, Double>  konta = new HashMap<>();

  public  void zalozKonto (Klient klient, Konto konto){
      konta.put(klient.getIdKonta(), konto.getStanKonta());
  }

  public void wplacPieniadze(Klient klient, double wplacanaKwota){
      stanKontaBanku = stanKontaBanku + wplacanaKwota;
      klient.setKonto(wplacanaKwota);
      konta.put(klient.getIdKonta(),klient.getStanKonta());
  }

   public void dajPozyczke(Klient klient, double wartosc){
      stanKontaBanku = stanKontaBanku - wartosc;
      klient.setKonto(wartosc);
      konta.put(klient.getIdKonta(),klient.getStanKonta());
   }





    public double getAktualnyStanKonta() {
        return stanKontaBanku;
    }



}
