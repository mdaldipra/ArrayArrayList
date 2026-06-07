package tugas;

// Nama : [Tulis Nama Kamu Disini]
// NPM  : [Tulis NPM Kamu Disini]

public class MainTugas {
    public static void main(String[] args) {
        
        // Menampilkan daftar nama mata kuliah
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Cloud Computing", "Kecerdasan Buatan"};
        System.out.println("== Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        
        System.out.println(); // Jarak
        
        // Membuat objek pengelola kelas
        KelasKuliah kelas = new KelasKuliah();

        // Menambah 5 objek Mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Aldi", "2410010507", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Nofiana", "2410010035", 50.0));
        kelas.tambahMahasiswa(new Mahasiswa("Hayyan", "2410010087", 100.0));
        kelas.tambahMahasiswa(new Mahasiswa("Faris", "2410010060", 35.0));
        kelas.tambahMahasiswa(new Mahasiswa("Aisya", "2410010053", 81.0));

        // Menampilkan seluruh mahasiswa (beserta total data)
        kelas.tampilkanSemua();
        
        System.out.println(); // Jarak kosong
        
        // Menampilkan rata-rata nilai dan jumlah lulus dengan spasi sejajar
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        
        System.out.println(); // Jarak kosong
        
        // Menambahkan 1 mahasiswa baru dan menampilkan ulang listnya
        System.out.println("Setelah menambah 1 mahasiswa baru:");
        kelas.tambahMahasiswa(new Mahasiswa("Cindy", "2410010108", 70));
        kelas.tampilkanSemua();
        
        System.out.println(); // Jarak kosong
        
        // Menampilkan rata-rata nilai dan jumlah lulus dengan spasi sejajar
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
    }
}