import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidasiPendaftaranTest {

    public String validasiPendaftaran(String nama, int umur, String email, boolean setujuSyarat) {
        if (nama == null || nama.isEmpty()) {
            return "Nama harus diisi";
        }

        if (umur < 17) {
            return "Umur minimal 17 tahun";
        }

        if (email == null || !email.contains("@")) {
            return "Email tidak valid";
        }

        if (!setujuSyarat) {
            return "Harus menyetujui syarat dan ketentuan";
        }

        return "Pendaftaran berhasil";
    }

    @Test
    void testNamaKosong() {
        assertEquals("Nama harus diisi",
                validasiPendaftaran("", 20, "riko@gmail.com", true));
    }

    @Test
    void testUmurKurangDari17() {
        assertEquals("Umur minimal 17 tahun",
                validasiPendaftaran("Riko", 16, "riko@gmail.com", true));
    }

    @Test
    void testEmailTidakValid() {
        assertEquals("Email tidak valid",
                validasiPendaftaran("Riko", 20, "rikogmail.com", true));
    }

    @Test
    void testTidakMenyetujuiSyarat() {
        assertEquals("Harus menyetujui syarat dan ketentuan",
                validasiPendaftaran("Riko", 20, "riko@gmail.com", false));
    }

    @Test
    void testPendaftaranBerhasil() {
        assertEquals("Pendaftaran berhasil",
                validasiPendaftaran("Riko", 20, "riko@gmail.com", true));
    }
}