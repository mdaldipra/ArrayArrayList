package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi
        // Jawaban Latihan 3.4 No. 2: Tambahkan parameter tahun terbit pada constructor
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        // Tambahan 1 buku lagi untuk melihat fungsi cariPenulis berfungsi dengan baik
        perpus.tambahBuku(new Buku("Sang Pemimpi", "Andrea Hirata", 2006));

        perpus.tampilkanKoleksi();

        System.out.println();
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali

        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        
        System.out.println();
        // Uji Jawaban Latihan 3.4 No. 1: Mengembalikan buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku tersedia sekarang: " + perpus.jumlahTersedia());
        
        System.out.println();
        // Uji Jawaban Latihan 3.4 No. 3: Cari buku berdasarkan penulis
        perpus.cariPenulis("Andrea Hirata");
    }
}