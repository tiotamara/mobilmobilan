package com.example.tio.projectkuis;

/**
 * Created by tio on 02/06/18.
 */

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "1. Hewan ini memiliki ciri khusus...",
            "2. Gambar diatas ini elang berperan sebagai konsumen tingkat ...",
            "3. Peralatan memasak diatas ini dapat menghantarkan panas karena terdapat sifat ...",
            "4. Burung diatas ini termasuk spesies langka yang hanya terdapat di ...",
            "5. Gambar diatas ini merupakan bahan baku untuk pembuatan ban, nama tumbuhan tersebut ialah...",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "cicak",
            "ekosistem",
            "panci",
            "cendrawasih",
            "karet",
    };

    //membuat array jawaban benar
    private String jawabanBenar[][] = {
            {
                    "autotomi",
                    "dapat memutuskan ekornya",
                    "dapat memutuskan ekor"
            },
            {
                    "3",
                    "konsumen tingkat 3",
                    "tingkat tiga",
                    "tingkat 3"
            },
            {
                    "konduktor",
                    "mengantarkan panas",
            },
            {
                    "papua",
            },
            {
                    "karet",
                    "tumbuhan karet",
                    "pohon karet"
            }
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String[] getJawabanBenar(int x){
        String[] jawaban = jawabanBenar[x];
        return jawaban;
    }
}
