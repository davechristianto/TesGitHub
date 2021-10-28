package kasino;

public class MakananMinuman extends Transaksi{
    private String idMakananMinuman;
    private double hargaMakananMinuman;

    //constructor
    public MakananMinuman(String idMakananMinuman, double hargaMakananMinuman, int kuantitas) {
        super(kuantitas);
        this.idMakananMinuman = idMakananMinuman;
        this.hargaMakananMinuman = hargaMakananMinuman;
    }

    //getter-setter
    public double getHargaMakananMinuman() {
        return hargaMakananMinuman;
    }

    public void setHargaMakananMinuman(double hargaMakananMinuman) {
        this.hargaMakananMinuman = hargaMakananMinuman;
    }

    public String getIdMakananMinuman() {
        return idMakananMinuman;
    }

    public void setIdMakananMinuman(String idMakananMinuman) {
        this.idMakananMinuman = idMakananMinuman;
    }
}
