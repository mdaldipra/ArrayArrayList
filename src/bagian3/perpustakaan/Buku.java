package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private boolean dipinjam;
    // Jawaban Latihan 3.4 No. 2: Tambah atribut tahunTerbit
    private int tahunTerbit; 

    // Constructor: dipanggil saat objek dibuat
    // Jawaban Latihan 3.4 No. 2: Lengkapi constructor dengan tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) { 
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // buku baru dianggap tersedia
    }

    // Getter: cara membaca atribut dari luar class
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Jawaban Latihan 3.4 No. 2: Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Mengembalikan keterangan buku dalam bentuk teks
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        // Jawaban Latihan 3.4 No. 2: Tampilkan tahun terbit di method info
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}