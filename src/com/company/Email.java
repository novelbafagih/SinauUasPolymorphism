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

    @Override
    public void menerimaSurat(PesanSurat pengirimProvider,
                              String isiSurat) {
        suratSurat.add(new Surat(pengirimProvider,isiSurat,suratId));
    }

    @Override
    public String melihatSurat(int suratId) {
        return Email.suratSurat.get(Email.suratId-1).toString();
    }
}
