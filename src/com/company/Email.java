package com.company;

import java.util.ArrayList;

public abstract class Email implements PesanSurat {
    protected static int suratId;
    protected static ArrayList<Surat> suratSurat;
    protected String userName;
    protected String idProvider;


    public Email(String userName) {
        this.userName = userName;
    }


    static {
        suratSurat = new ArrayList<Surat>();
        suratId = 1;
    }

    @Override
    public void kirimSurat(PesanSurat penerimaProvider,
                           String isiSurat){
        penerimaProvider.menerimaSurat(penerimaProvider, isiSurat);
        suratId++;
    }

    public static int getSuratId() {
        return suratId;
    }
}
