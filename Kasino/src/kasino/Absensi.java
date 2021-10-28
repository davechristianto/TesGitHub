package kasino;
import java.util.Date;

public class Absensi {
    private Date tanggalAbsensi;
    private StatusAbsensi statusAbsensi;

    //constructor
    public Absensi(Date tanggalAbsensi, StatusAbsensi statusAbsensi) {
        this.tanggalAbsensi = tanggalAbsensi;
        this.statusAbsensi = statusAbsensi;
    }

    //getter-setter
    public StatusAbsensi getStatusAbsensi() {
        return statusAbsensi;
    }

    public void setStatusAbsensi(StatusAbsensi statusAbsensi) {
        this.statusAbsensi = statusAbsensi;
    }

    public Date getTanggalAbsensi() {
        return tanggalAbsensi;
    }

    public void setTanggalAbsensi(Date tanggalAbsensi) {
        this.tanggalAbsensi = tanggalAbsensi;
    }
}