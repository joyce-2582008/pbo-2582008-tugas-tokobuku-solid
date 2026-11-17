public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int hargaAkhir() {
        int kelipatan500 = (beratGram + 499) / 500;
        int ongkir = kelipatan500 * 5000;
        return getHarga() + ongkir;
    }

    @Override
    public String keterangan() {
        int kelipatan500 = (beratGram + 499) / 500;
        int ongkir = kelipatan500 * 5000;
        return beratGram + " gram, ongkir " + Buku.formatRupiah(ongkir);
    }
}