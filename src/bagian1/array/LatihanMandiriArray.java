package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {
        //Jawaban Latihan 1.4 No. 1 (Suhu tertinggi dan terendah)
        double[] suhu = {25.5, 15.0, 31.3, 35.0, 15.1, 29.1};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah : " + min);
        
        System.out.println("=========================================");

        //Jawaban Latihan 1.4 No. 2 (Cetak nama hari lebih dari 5 huruf)
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Sabtu"};
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
        
        System.out.println("=========================================");

        //Jawaban Latihan 1.4 No. 3 (Hitung bilangan genap)
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah genap: " + genap); // hasil: 4 
    }
}