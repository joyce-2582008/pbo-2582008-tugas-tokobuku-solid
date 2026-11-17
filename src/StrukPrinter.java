public class StrukPrinter {
    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println(judul);
        for (Buku b : keranjang.getIsi()) {
            System.out.printf("%s (%s)%n", b.getJudul(), b.getPenulis());
            System.out.printf("  Harga       : %s%n", Buku.formatRupiah(b.getHarga()));
            System.out.printf("  Keterangan  : %s%n", b.keterangan());
            System.out.printf("  Harga akhir : %s%n", Buku.formatRupiah(b.hargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println("-------------- PEMBAYARAN ---------------");
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), Buku.formatRupiah(m.totalBayar(totalBelanja)));
        }
    }
}