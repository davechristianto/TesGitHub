package kasino;
import java.util.Date;

public class Anggota extends Tamu{
    private String password;

    //constructor
    public Anggota(String password, String id, String nama, Date tanggalLahir, String noTelepon) {
        super(id, nama, tanggalLahir, noTelepon);
        this.password = password;
    }

    //getter-setter
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}