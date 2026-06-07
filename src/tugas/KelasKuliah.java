package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // ArrayList yang menampung objek bertipe Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method menghitung rata-rata nilai
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0.0;
        }
        
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int jumlah = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Method menampilkan semua data
    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". " + mhs.getNama() + " (" + mhs.getNpm() + ") - Nilai: " + mhs.getNilai() + " [" + status + "]");
        }
        // Tambahan untuk menampilkan total data sesuai gambar
        System.out.println("Total data: " + daftarMahasiswa.size());
    }
}