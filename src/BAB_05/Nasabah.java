package BAB_05;

public class Nasabah {

    private String nama;
    private double saldo;

    public Nasabah(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        saldo = saldo + jumlah;
    }

    public void tarik(double jumlah) {
        saldo = saldo - jumlah;
    }

    public static void main(String[] args) {
        // INSTANCE OBJECT (REGISTER NASABAH)
        Nasabah nasabah = new Nasabah("Wahyu Radar", 500000);
        System.out.println("Nama Nasabah : " + nasabah.getNama());
        System.out.println("Saldo Awal : " + nasabah.getSaldo());

        // TRANSAKSI SETOR
        nasabah.setor(100000);
        System.out.println("\nSetor : Rp. 100.000,-");
        System.out.println("Saldo : " + nasabah.getSaldo());

        // TRANSAKSI TARIK
        nasabah.tarik(50000);
        System.out.println("\nTarik : Rp. 50.000,-");
        System.out.println("Saldo : " + nasabah.getSaldo());

    }
}
