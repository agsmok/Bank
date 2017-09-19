public class Konto {
    private int idKonto;
    private  double stanKonta;
    private long idKlient;
    private static int id=1;

    public Konto(double stanKonta, long idKlient) {
        this.stanKonta = stanKonta;
        this.idKlient = idKlient;
        this.idKonto = id++;
    }

    public double getStanKonta(){
        return stanKonta;
    }
    public Integer getIdKonta(){
        return idKonto;
    }

    public long getIdKlient() {
        return idKlient;


    }
}
