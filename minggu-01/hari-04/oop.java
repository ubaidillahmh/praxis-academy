
/**
 * Manusia
 */
class Manusia {
    String nama;
    
}

/**
 * Mahasiswa
 */
class Mahasiswa extends Manusia{
    String nim;
    String jurusan;
    
    Mahasiswa(String nama, String nim, String jurusan)
    {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    String resume()
    {
        return nim + " - " + nama + " - " + jurusan;
    }
    
}

/**
 * oop
 */
public class oop {

    public static void main(String[] args) {
        Mahasiswa ubed = new Mahasiswa("ubed", "13650081", "TI");
        System.out.println(ubed.resume());
    }
}