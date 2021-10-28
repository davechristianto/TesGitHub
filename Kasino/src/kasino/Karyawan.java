package kasino;
import java.util.ArrayList;
import java.util.Date;

public abstract class Karyawan extends Pengguna{
    private double gaji;
    private ArrayList<Absensi> arrAbsensi;

    //constructor
    public Karyawan(double gaji, String id, String nama, Date tanggalLahir, String noTelepon) {
        super(id, nama, tanggalLahir, noTelepon);
        this.arrAbsensi = new ArrayList<>();
        this.gaji = gaji;
    }

    //getter-setter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public ArrayList<Absensi> getArrAbsensi() {
        return arrAbsensi;
    }

    public void setArrAbsensi(ArrayList<Absensi> arrAbsensi) {
        this.arrAbsensi = arrAbsensi;
    }
}
