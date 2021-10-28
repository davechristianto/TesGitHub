package kasino;

public abstract class Transaksi {
    private int kuantitas;

    //constructor
    public Transaksi(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    //getter-setter
    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }
}
