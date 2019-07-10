
class Koskosan
{
    String pemilik = "Bu Miryam";
    int harga = 350000;
    String alamat = "Jl Sorowajan Baru";
}

class Bayarkos extends Koskosan{

    String hari;
    String orang;
    int bayar;

    Bayarkos(String hari, String orang, int bayar)
    {
        this.hari = hari;
        this.orang = orang;
        this.bayar = bayar;
    }

    String cekbayar()
    {
        String hasil;
        if (harga == bayar) {
            hasil = "terima kasih sudah membayar saudara/i " + orang;
        }else{
            hasil = "Harap membayar dengan jumlah pas sebesar " + harga + " saudara/i " + orang;
        }
        return hasil;
    }
}

public class kos {

    public static void main(String[] args) {
        Bayarkos ubed = new Bayarkos("Jumat", "Ubed", 350000);
        System.out.println(ubed.cekbayar());
    }
}