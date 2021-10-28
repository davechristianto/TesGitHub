package kasino;

public class Layanan extends Transaksi{
    private String idLayanan;
    private double hargaLayanan;

    //constructor
    public Layanan(String idLayanan, double hargaLayanan, int kuantitas) {
        super(kuantitas);
        this.idLayanan = idLayanan;
        this.hargaLayanan = hargaLayanan;
    }

    //getter-setter
    public double getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(double hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }

    public String getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(String idLayanan) {
        this.idLayanan = idLayanan;
    }
}
