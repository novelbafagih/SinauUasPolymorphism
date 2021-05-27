package com.company;

public class Surat {
    private PesanSurat pengirim;
    private String isiSurat;
    private int suratId;

    public Surat(PesanSurat pengirim, String isiSurat, int suratId) {
        this.pengirim = pengirim;
        this.isiSurat = isiSurat;
        this.suratId = suratId;
    }

    @Override
    public String toString() {
        return "Surat{" +
                "pengirim=" + pengirim.melihatSurat(suratId) +
                ", isiSurat='" + isiSurat + '\'' +
                ", suratId=" + suratId +
                '}';
    }
}
