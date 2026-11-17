public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilai);
    }

    // Ketentuan 5 awal: tulis dulu return totalBelanja - nilai;
    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja - nilai;
    }
}