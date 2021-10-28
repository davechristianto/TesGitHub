package kasino;
import java.util.Date;

public abstract class Pengguna {
    private String id;
    private String nama;
    private Date tanggalLahir;
    private String noTelepon;

    //constructor
    public Pengguna(String id, String nama, Date tanggalLahir, String noTelepon) {
        this.id = id;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.noTelepon = noTelepon;
    }
    
    //getter-setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
}