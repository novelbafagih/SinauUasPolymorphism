package com.company;

public interface PesanSurat {
    public void kirimSurat(PesanSurat penerimaProvider,
                           String isiSurat);

    public void menerimaSurat(PesanSurat pengirimProvider,
                           String isiSurat);

    public String melihatSurat(int suratId );
}
