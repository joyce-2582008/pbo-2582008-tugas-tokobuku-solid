public interface MetodeBayar {
    String nama();

    // Kontrak: hasilnya tidak pernah negatif
    int totalBayar(int totalBelanja);
}