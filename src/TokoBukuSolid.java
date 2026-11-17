public class TokoBukuSolid {
    public static void main(String[] args) {
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambah(cetak1);
        keranjang1.tambah(cetak2);
        keranjang1.tambah(digital);
        keranjang1.tambah(audio);

        Keranjang keranjang2 = new Keranjang();
        keranjang2.tambah(digital);

        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("=========== KERANJANG PERTAMA ===========", keranjang1);
        printer.cetakPembayaran(keranjang1.hitungTotal(), pilihan);

        System.out.println();

        printer.cetakKeranjang("============ KERANJANG KEDUA ============", keranjang2);
        printer.cetakPembayaran(keranjang2.hitungTotal(), pilihan);
    }
}