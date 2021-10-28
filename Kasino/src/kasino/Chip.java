package kasino;

public class Chip extends Transaksi implements KonstantaNilaiChip{
    private TipePenukaran tipePenukaran;
    private double nilaiChip;

    public Chip(TipePenukaran tipePenukaran, double nilaiChip, int kuantitas) {
        super(kuantitas);
        this.tipePenukaran = tipePenukaran;
        this.nilaiChip = nilaiChip;
    }

    public double getNilaiChip() {
        return nilaiChip;
    }

    public void setNilaiChip(double nilaiChip) {
        this.nilaiChip = nilaiChip;
    }

    public TipePenukaran getTipePenukaran() {
        return tipePenukaran;
    }

    public void setTipePenukaran(TipePenukaran tipePenukaran) {
        this.tipePenukaran = tipePenukaran;
    }
}
