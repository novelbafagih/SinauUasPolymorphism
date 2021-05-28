package com.company;

public class Surat {
    private PesanSurat pengirim;
    private String isiSurat;

    public Surat(PesanSurat pengirim, String isiSurat) {
        this.pengirim = pengirim;
        this.isiSurat = isiSurat;
    }

    @Override
    public String toString() {
        return "Surat{" +
                "pengirim=" + pengirim +
                ", isiSurat='" + isiSurat + '\'' +
                '}';
    }

    public String getIsiSurat() {
        return isiSurat;
    }
}
