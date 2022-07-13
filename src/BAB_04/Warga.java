package BAB_04;

public class Warga {

    // DATA
    private int count;
    private String nama;
    private double umur;
    private boolean naKes;

    // CONSTRUCTOR
    public Warga(int count, String nama, double umur, boolean naKes) {
        this.count = count;
        this.nama = nama;
        this.umur = umur;
        this.naKes = naKes;
    }

    // METHOD GETTER
    public String getNama() {
        return nama;
    }

    public double getUmur() {
        return umur;
    }

    public boolean getNaKes() {
        return naKes;
    }

    public int getCount() {
        return count;
    }

}
 