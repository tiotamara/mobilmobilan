package com.example.tio.projectkuis;

/**
 * Created by tio on 02/06/18.
 */

public class SoalPilihanGanda {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "1. Kemampuan ekolokasi yang dimiliki kelelawar berfungsi untuk?",
            "2. Bunglon memiliki ciri khusus....",
            "3. Cara perkembangbiakan hewan ada berapa macam..",
            "4. Berikut kegiatan manusia yang dapat mempengaruhi keseimbangan ekosistem, kecuali...",
            "5. Hewan yang hampir punah disebut...",
            "6. salah satu usaha untuk melestarikan jenis hewan dan tumbuhan dilindungi adalah...",
            "7. peristiwa perpindahan panas dari zat yang bersuhu tinggi ke zat yang bersuhu rendah melalui suatu bahan penghantar disebut...",
            "8. perhatikan tabel berikut!\n" +
                    "1. Kayu\n" +
                    "2. Wajan\n" +
                    "3. Plastik \n" +
                    "4. setrika\n" +
                    "5. Kain\n" +
                    "Yang termasuk isolator panas adalah...",
            "9. Faktor-faktor penyebab pelapukan benda antara lain...",
            "10.  Berikut yang merupakan sifat karet adalah...",

    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Mencari Makan","Mengetahui Mangsa","Mencari Cacing","Membuat kelelawar menjadi kuat"},
            {"Dapat Terbang","Merangkak di dinding","Merubah Warna Kulit","Tidur dimalam Hari"},
            {"1","2","3","4"},
            {"Penebangan dan pembakaran hutan secara liar dapat menyebabkan suatu lingkungan menjadi tandus, banjir, dan kematian hewan dan tumbuhan hutan.","Perburuan liar dapat menyebabkan musnahnya suatu jenis makhluk hidup.","Penggunakan pupuk dan pestisida secara berlebihan dapat menyebabkan kematian dan terganggunya kehidupan makluk hidup yang lain.","Menggunakan pupuk organik untuk menyuburkan tanaman"},
            {"Hewan Nokturnal","Hewan Ajaib","Hewan Langka","Hewan Maksimal"},
            {"Memeliharanya dirumah","Mengembangbiakan","Merusak Habitatnya","Memburunya"},
            {"Konduksi","Isolasi","Konduktor","Isolator"},
            {"1,2,3","1,3,4","2,3,4","1,3,5"},
            {"Pelapukan biologi dan kimia","Pelapukan fisika dan mekanik","Pelapukan biologi dan fisika","Pelapukan fisika da kimia"},
            {"Lentur","Mudah Berkarat","Tembus Air","Mudah Patah"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Mencari Makan",
            "Merubah Warna Kulit",
            "2",
            "Menggunakan pupuk organik untuk menyuburkan tanaman",
            "Hewan Langka",
            "Mengembangbiakan",
            "Konduksi",
            "1,3,5",
            "Pelapukan biologi dan fisika",
            "Lentur",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil pilihan jawaban 4
    public String getPilihanJawaban4(int x){
        String jawaban3 = pilihanJawaban[x][3];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
