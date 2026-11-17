public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMb;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMb) {
        super(judul, penulis, harga);
        this.ukuranMb = ukuranMb;
    }

    @Override
    public int hargaAkhir() {
        int diskon = (int) (getHarga() * 0.20);
        return getHarga() - diskon;
    }

    @Override
    public String keterangan() {
        return ukuranMb + " MB, diskon 20%";
    }

    @Override
    public String linkUnduh() {
        String formatJudul = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/ebook/" + formatJudul;
    }
}