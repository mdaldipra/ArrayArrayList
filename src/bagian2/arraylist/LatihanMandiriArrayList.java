package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        
        // Jawaban Latihan 2.5 No. 1 (Daftar belanja dan jumlah akhir)
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak");
        belanja.add("Telur");
        belanja.add("Gula");
        belanja.remove(1); // Menghapus item ke-2 (indeks 1)
        System.out.println("Isi list : " + belanja);
        System.out.println("Jumlah   : " + belanja.size());
        
        System.out.println("=========================================");
        
        // Jawaban Latihan 2.5 No. 2 (Nilai terbesar di ArrayList)
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(60); nilai.add(70); nilai.add(80);
        nilai.add(90); nilai.add(100);
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Terbesar: " + max); // hasil: 95
        
        System.out.println("=========================================");
        
        // Jawaban Latihan 2.5 No. 3 (Nama berawalan A)
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi","Budi","Aldi","Citra","Arin","Doni"};
        for (String d : data) nama.add(d);
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println(n);
        }
        // hasil: Andi, Ayu, Adit
        
    }
}